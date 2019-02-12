package controllers;

import actions.TimedLog;
import com.fasterxml.jackson.databind.JsonNode;
import models.IngredienteR;
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



public class IngredienteRController extends Controller {
    @Inject
    FormFactory formFactory;

    @Transactional
    @TimedLog //Composicion de Acciones
    public Result crearIngrediente(){
        Form<IngredienteR> form = formFactory.form(IngredienteR.class).bindFromRequest();
        if (form.hasErrors()) {
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.badRequest(form.errorsAsJson());
        }

        IngredienteR ingrediente = form.get();

        ingrediente.save();

        //mensajes i18n
        Messages messages = Http.Context.current().messages();
        System.out.println(messages.at("ingredient-created"));


        // content-negotiation
        if (request().accepts("application/json")) {
            return ok(play.libs.Json.toJson(ingrediente));
        }
        else if (request().accepts("application/xml")) {
            Content content = views.xml.ingrediente.render(ingrediente);
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result consultarIngrediente(Integer ingredienteID){

        IngredienteR ingrediente = IngredienteR.findById(ingredienteID.longValue());

        if (ingrediente == null){
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (request().accepts("application/json")) {
            JsonNode json = play.libs.Json.toJson(ingrediente);
            return Results.ok(json);
        } else if (request().accepts("application/xml")) {
            Content content = views.xml.ingrediente.render(ingrediente);
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result consultarIngredientePorNombre(String ingredienteName){


        IngredienteR ingrediente = IngredienteR.findByName(ingredienteName);

        if (ingrediente == null){
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (request().accepts("application/json")) {
            JsonNode json = play.libs.Json.toJson(ingrediente);
            return Results.ok(json);
        } else if (request().accepts("application/xml")) {
            Content content = views.xml.ingrediente.render(ingrediente);
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result listarIngredientes() {

        List<IngredienteR> ingredientes = IngredienteR.findAll();

        if (ingredientes == null){
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (request().accepts("application/json")) {
            JsonNode json = play.libs.Json.toJson(ingredientes);
            return Results.ok(json);
        } else if (request().accepts("application/xml")) {
            Content content = views.xml.ingredientes.render(ingredientes);
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result borrarIngrediente(Integer ingredienteId) {
        IngredienteR ingrediente = IngredienteR.findById(ingredienteId.longValue());
        if (ingrediente == null) {
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (ingrediente.delete()) {
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("ingredient-deleted"));
            return ok();
        }

        return Results.notFound();
    }
    
}
