package controllers;

import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Results;
import play.mvc.Security;

public class ActionAuthenticator  extends Security.Authenticator {

    @Override
    public String getUsername(Http.Context ctx) {
        String token = ctx.request().getHeaders().get("Authentication").orElse("");
        if (token == null) {
            return null;
        }

        if (!token.equals("APILINO")) {
            return null;
        }

        return token;
    }

    @Override
    public Result onUnauthorized(Http.Context ctx) {
        return Results.forbidden("No tiene un token de usuario válido");
    }
}
