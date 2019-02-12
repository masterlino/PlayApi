package controllers;

import actions.TimedLog;
import com.fasterxml.jackson.databind.JsonNode;
import models.IngredienteR;
import models.LibroReceta;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Results;
import play.twirl.api.Content;

import javax.inject.Inject;
import java.util.List;

public class LibroRecetaController extends Controller {
    @Inject
    FormFactory formFactory;

    @Transactional
    @TimedLog //Composicion de Acciones
    public Result crearLibroReceta(){
        Form<LibroReceta> form = formFactory.form(LibroReceta.class).bindFromRequest();
        if (form.hasErrors()) {
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.badRequest(form.errorsAsJson());
        }

        LibroReceta libroReceta = form.get();

        libroReceta.save();

        //mensajes i18n
        Messages messages = Http.Context.current().messages();
        System.out.println(messages.at("recipe-book-created"));


        // content-negotiation
        if (request().accepts("application/json")) {
            return ok(play.libs.Json.toJson(libroReceta));
        }
        else if (request().accepts("application/xml")) {
            Content content = views.xml.libroReceta.render(libroReceta);
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result consultarLibroReceta(Integer libroRecetaID){

        LibroReceta libroReceta = LibroReceta.findById(libroRecetaID.longValue());

        if (libroReceta == null){
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (request().accepts("application/json")) {
            JsonNode json = play.libs.Json.toJson(libroReceta);
            return Results.ok(json);
        } else if (request().accepts("application/xml")) {
            Content content = views.xml.libroReceta.render(libroReceta);
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result consultarLibroRecetaPorNombre(String libroRecetaName){


        LibroReceta libroReceta = LibroReceta.findByName(libroRecetaName);

        if (libroReceta == null){
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (request().accepts("application/json")) {
            JsonNode json = play.libs.Json.toJson(libroReceta);
            return Results.ok(json);
        } else if (request().accepts("application/xml")) {
            Content content = views.xml.libroReceta.render(libroReceta);
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result listarLibroRecetas() {

        List<LibroReceta> libroRecetas = LibroReceta.findAll();

        if (libroRecetas == null){
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (request().accepts("application/json")) {
            JsonNode json = play.libs.Json.toJson(libroRecetas);
            return Results.ok(json);
        } else if (request().accepts("application/xml")) {
            Content content = views.xml.libroRecetas.render(libroRecetas);
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result borrarLibroReceta(Integer libroRecetaId) {
        LibroReceta libroReceta = LibroReceta.findById(libroRecetaId.longValue());
        if (libroReceta == null) {
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (libroReceta.delete()) {
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("recipe-book-deleted"));
            return ok();
        }

        return Results.notFound();
    }
}
