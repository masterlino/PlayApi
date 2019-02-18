// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/Play-Entrega/conf/routes
// @DATE:Mon Feb 18 12:49:43 CET 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAutorController AutorController = new controllers.ReverseAutorController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseIngredienteRController IngredienteRController = new controllers.ReverseIngredienteRController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRecetaController RecetaController = new controllers.ReverseRecetaController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLibroRecetaController LibroRecetaController = new controllers.ReverseLibroRecetaController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAutorController AutorController = new controllers.javascript.ReverseAutorController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseIngredienteRController IngredienteRController = new controllers.javascript.ReverseIngredienteRController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRecetaController RecetaController = new controllers.javascript.ReverseRecetaController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLibroRecetaController LibroRecetaController = new controllers.javascript.ReverseLibroRecetaController(RoutesPrefix.byNamePrefix());
  }

}
