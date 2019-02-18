package controllers;

import actions.TimedLog;
import com.fasterxml.jackson.databind.JsonNode;
import models.Autor;
import play.cache.SyncCacheApi;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.i18n.Messages;
import play.mvc.*;
import play.twirl.api.Content;


import javax.inject.Inject;
import java.util.List;


public class AutorController extends Controller {

    @Inject private SyncCacheApi cache;

    @Inject
    FormFactory formFactory;

    @Transactional
    @TimedLog //Composicion de Acciones
    public Result crearAutor(){

        Form<Autor> form = formFactory.form(Autor.class).bindFromRequest();
        if (form.hasErrors()) {
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.badRequest(form.errorsAsJson());
        }

        Autor autor = form.get();

        autor.save();

        //cacheado de autor
        cache.set("autor-" + autor.getId(), autor);

        //mensajes i18n
        Messages messages = Http.Context.current().messages();
        System.out.println(messages.at("author-created"));


        // content-negotiation
        if (request().accepts("application/json")) {
            return ok(play.libs.Json.toJson(autor));
        }
        else if (request().accepts("application/xml")) {
            Content content = views.xml.autor.render(autor);
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result consultarAutor(Integer autorID){

        //vemos si esta cacheado
          Autor autorCache = cache.get("autor-" + autorID);
        if (autorCache != null){
            if (request().accepts("application/json")) {
                JsonNode json = play.libs.Json.toJson(autorCache);
                return Results.ok(json);
            } else if (request().accepts("application/xml")) {
                Content content = views.xml.autor.render(autorCache);
                return Results.ok(content);
            }

            return Results.status(406);

        }
        else {

            Autor autor = Autor.findById(autorID.longValue());

            if (autor == null){
                //mensajes i18n
                Messages messages = Http.Context.current().messages();
                System.out.println(messages.at("runtime-error"));
                return Results.notFound();
            }

            if (request().accepts("application/json")) {
                JsonNode json = play.libs.Json.toJson(autor);
                return Results.ok(json);
            } else if (request().accepts("application/xml")) {
                Content content = views.xml.autor.render(autor);
                return Results.ok(content);
            }

            return Results.status(406);
        }
    }

    @TimedLog //Composicion de Acciones
    public Result consultarAutorPorNombre(String autorName){

        // OPCIONAL consultar los parametros de la query string hacer una busqueda por name  o edad dependiendo de lo q se pasa

        Autor autor = Autor.findByName(autorName);

        if (autor == null){
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (request().accepts("application/json")) {
            JsonNode json = play.libs.Json.toJson(autor);
            return Results.ok(json);
        } else if (request().accepts("application/xml")) {
            Content content = views.xml.autor.render(autor);
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result listarAutores() {

        List<Autor> autores = Autor.findAll();

        if (autores == null){
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (request().accepts("application/json")) {
            JsonNode json = play.libs.Json.toJson(autores);
            return Results.ok(json);
        } else if (request().accepts("application/xml")) {
            Content content = views.xml.autores.render(autores);
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result actualizarAutor (Integer autorId, String nuevoNombre, Integer nuevaEdad) {
        Autor autor = Autor.findById(autorId.longValue());
        if (autor == null) {
            return Results.notFound();
        }

        autor.setNombre(nuevoNombre);
        autor.setEdad(nuevaEdad);
        autor.update();

        if (request().accepts("application/json")) {
            JsonNode json = play.libs.Json.toJson(autor);
            return Results.ok(json);
        } else if (request().accepts("application/xml")) {
            Content content = views.xml.autor.render(autor);
            return Results.ok(content);
        }

        return Results.status(406);
    }

    @TimedLog //Composicion de Acciones
    public Result borrarAutor(Integer autorId) {
        Autor autor = Autor.findById(autorId.longValue());
        if (autor == null) {
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("runtime-error"));
            return Results.notFound();
        }

        if (autor.delete()) {
            //mensajes i18n
            Messages messages = Http.Context.current().messages();
            System.out.println(messages.at("author-deleted"));
            //borramos de la cache el Autor
            cache.remove("autor-"+ autorId);
            return ok();
        }




        return Results.notFound();
    }
}
