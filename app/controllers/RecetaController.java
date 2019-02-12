package controllers;

import actions.TimedLog;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Key;
import models.Autor;
import models.IngredienteR;
import models.Receta;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.i18n.Messages;
import play.mvc.*;
import play.twirl.api.Content;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


//@Security.Authenticated(ActionAuthenticator.class)
public class RecetaController extends Controller {
    @Inject
    FormFactory formFactory;

    @Transactional
    @TimedLog //Composicion de Acciones
    public Result crearReceta(){
        Form<Receta> form = formFactory.form(Receta.class).bindFromRequest();
        if (form.hasErrors()) {
            return Results.badRequest(form.errorsAsJson());
        }

        Receta receta = form.get();

        // hay que vaciar el autor de receta para rellenarlo con el de la BD si existe
        Autor autorToCreate = receta.getAutor();

        receta.setAutor(new Autor());

        Autor autorInDB = Autor.findByName(autorToCreate.getNombre());
        if (autorInDB != null) {
            receta.setAutor(autorInDB);
        } else {
            autorToCreate.save();
            receta.setAutor(autorToCreate);
        }

        // hay que vaciar los ingrediente de receta para rellenarlo con los de la BD si existen
        List<IngredienteR> ingredientesToCreate = receta.getIngredientes();

        receta.setIngredientes(new ArrayList<>());

        for (IngredienteR ingredienteToCreate : ingredientesToCreate) {
            IngredienteR ingredienteRInDB = IngredienteR.findByName(ingredienteToCreate.getNombre());
            if (ingredienteRInDB != null) {
                if (ingredienteRInDB.getCantidad() == ingredienteToCreate.getCantidad()) {
                    receta.addIngrediente(ingredienteRInDB);
                }
            } else {
                ingredienteToCreate.save();
                receta.addIngrediente(ingredienteToCreate);
            }
        }

        receta.save();

        //mensajes i18n
        Messages messages = Http.Context.current().messages();
        System.out.println(messages.at("recipe-created"));

        // content-negotiation
        if (request().accepts("application/json")) {
            return ok(play.libs.Json.toJson(receta));
        }
        else if (request().accepts("application/xml")) {
            Content content = views.xml.receta.render(receta, receta.getAutor(), receta.getIngredientes());
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result consultarRecetasAutor(String autorName){

        Autor autor = Autor.findByName(autorName);

        List<Receta> recetas = Receta.findAllWithAuthor(autor);

        if (recetas == null){
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (request().accepts("application/json")) {
            JsonNode json = play.libs.Json.toJson(recetas);
            return Results.ok(json);
        } else if (request().accepts("application/xml")) {
            Content content = views.xml.recetas.render(recetas);
            return Results.ok(content);
        }

        return Results.status(406);

    }

    @TimedLog //Composicion de Acciones
    public Result consultarRecetaPorNombre(String recetaName){

        Receta receta = Receta.findByName(recetaName);

        if (receta == null){
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (request().accepts("application/json")) {
            JsonNode json = play.libs.Json.toJson(receta);
            return Results.ok(json);
        } else if (request().accepts("application/xml")) {
            Content content = views.xml.receta.render(receta, receta.getAutor(), receta.getIngredientes());
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result actualizaReceta(Integer recetaId){
        Form<Receta> form = formFactory.form(Receta.class).bindFromRequest();
        if (form.hasErrors()) {
            return Results.badRequest(form.errorsAsJson());
        }

        Receta recetaWithUpdates = form.get();

        Receta recetaDB = Receta.findById(recetaId.longValue());
        if (recetaDB == null) {
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("recipe-notfound"));
            return Results.notFound();
        }

        if (recetaWithUpdates.getTitulo() != null) {
            recetaDB.setTitulo(recetaWithUpdates.getTitulo());
        }

        if (recetaWithUpdates.getPreparacion() != null) {
            recetaDB.setPreparacion(recetaWithUpdates.getPreparacion());
        }

        if (recetaWithUpdates.getPreparacion() != null) {
            recetaDB.getAutor().delete();
            recetaDB.setAutor(recetaWithUpdates.getAutor());
        }

        if (recetaWithUpdates.getIngredientes() != null) {
            //borramos todos los ingredientes antiguos
            List<IngredienteR> ingredientesRDB = recetaDB.getIngredientes();
            for(IngredienteR ingredienteR : ingredientesRDB){
                if(ingredienteR.delete()){
                    //mensajes i18n
                    Messages messages = Http.Context.current().messages();
                    System.out.println(messages.at("ingredient-deleted"));
                }
                else{
                    //mensajes i18n
                    Messages messages = Http.Context.current().messages();
                    System.out.println(messages.at("runtime-error"));
                }
            }

            recetaDB.setIngredientes(recetaWithUpdates.getIngredientes());
        }

        recetaDB.update();

        if (request().accepts("application/json")) {
            JsonNode json = play.libs.Json.toJson(recetaDB);
            return Results.ok(json);
        } else if (request().accepts("application/xml")) {
            Content content = views.xml.receta.render(recetaDB, recetaDB.getAutor(), recetaDB.getIngredientes());
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result borrarReceta(Integer recetaId) {
        Receta receta = Receta.findById(recetaId.longValue());
        if (receta == null) {
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (receta.delete()) {
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("recipe-deleted"));

            return ok();
        }

        return Results.notFound();
    }

}
