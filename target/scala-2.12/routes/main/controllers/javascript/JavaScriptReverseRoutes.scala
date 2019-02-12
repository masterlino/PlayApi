// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/Play-Entrega/conf/routes
// @DATE:Tue Feb 12 16:17:56 CET 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:9
package controllers.javascript {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAutorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def crearAutor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AutorController.crearAutor",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "autor/"})
        }
      """
    )
  
    // @LINE:17
    def consultarAutor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AutorController.consultarAutor",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "autor/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:22
    def listarAutores: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AutorController.listarAutores",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "autores"})
        }
      """
    )
  
    // @LINE:25
    def borrarAutor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AutorController.borrarAutor",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "autor/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:18
    def consultarAutorPorNombre: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AutorController.consultarAutorPorNombre",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "autor/byName/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
  }

  // @LINE:53
  class ReverseIngredienteRController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def crearIngrediente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredienteRController.crearIngrediente",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ingrediente/"})
        }
      """
    )
  
    // @LINE:60
    def listarIngredientes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredienteRController.listarIngredientes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredientes"})
        }
      """
    )
  
    // @LINE:57
    def consultarIngredientePorNombre: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredienteRController.consultarIngredientePorNombre",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingrediente/byName/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:63
    def borrarIngrediente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredienteRController.borrarIngrediente",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "ingrediente/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:56
    def consultarIngrediente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredienteRController.consultarIngrediente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingrediente/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:33
  class ReverseRecetaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def consultarRecetaPorNombre: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetaController.consultarRecetaPorNombre",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "receta/byName/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:39
    def consultarRecetasAutor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetaController.consultarRecetasAutor",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "receta/byAuthorName/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:45
    def borrarReceta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetaController.borrarReceta",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "receta/" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:33
    def crearReceta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetaController.crearReceta",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "receta/"})
        }
      """
    )
  
    // @LINE:42
    def actualizaReceta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetaController.actualizaReceta",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "receta/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:71
  class ReverseLibroRecetaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:81
    def borrarLibroReceta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LibroRecetaController.borrarLibroReceta",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "libroreceta/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:71
    def crearLibroReceta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LibroRecetaController.crearLibroReceta",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "libroreceta/"})
        }
      """
    )
  
    // @LINE:78
    def listarLibroRecetas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LibroRecetaController.listarLibroRecetas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "libroreceta"})
        }
      """
    )
  
    // @LINE:75
    def consultarLibroRecetaPorNombre: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LibroRecetaController.consultarLibroRecetaPorNombre",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "libroreceta/byName/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:74
    def consultarLibroReceta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LibroRecetaController.consultarLibroReceta",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "libroreceta/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
