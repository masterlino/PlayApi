// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/Play-Entrega/conf/routes
// @DATE:Mon Feb 18 12:49:43 CET 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:9
package controllers {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:14
  class ReverseAutorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def actualizarAutor(id:Integer, nuevoNombre:String, nuevaEdad:Integer): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "autor/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("nuevoNombre", nuevoNombre)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("nuevaEdad", nuevaEdad)))))
    }
  
    // @LINE:14
    def crearAutor(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "autor/")
    }
  
    // @LINE:17
    def consultarAutor(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "autor/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:22
    def listarAutores(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "autores")
    }
  
    // @LINE:28
    def borrarAutor(id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "autor/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:18
    def consultarAutorPorNombre(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "autor/byName/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
  }

  // @LINE:59
  class ReverseIngredienteRController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def crearIngrediente(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "ingrediente/")
    }
  
    // @LINE:66
    def listarIngredientes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ingredientes")
    }
  
    // @LINE:63
    def consultarIngredientePorNombre(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ingrediente/byName/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:69
    def borrarIngrediente(id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "ingrediente/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:62
    def consultarIngrediente(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ingrediente/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
  }

  // @LINE:36
  class ReverseRecetaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def consultarRecetaPorNombre(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "receta/byName/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:44
    def consultarRecetasAutor(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "receta/byAuthorName/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:51
    def borrarReceta(id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "receta/" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:36
    def crearReceta(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "receta/")
    }
  
    // @LINE:48
    def actualizaReceta(id:Integer): Call = {
      
      Call("PATCH", _prefix + { _defaultPrefix } + "receta/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
  }

  // @LINE:77
  class ReverseLibroRecetaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:87
    def borrarLibroReceta(id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "libroreceta/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:77
    def crearLibroReceta(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "libroreceta/")
    }
  
    // @LINE:84
    def listarLibroRecetas(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "libroreceta")
    }
  
    // @LINE:81
    def consultarLibroRecetaPorNombre(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "libroreceta/byName/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:80
    def consultarLibroReceta(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "libroreceta/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
  }


}
