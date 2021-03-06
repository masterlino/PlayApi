// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/Play-Entrega/conf/routes
// @DATE:Mon Feb 18 12:49:43 CET 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  Assets_2: controllers.Assets,
  // @LINE:14
  AutorController_4: controllers.AutorController,
  // @LINE:36
  RecetaController_0: controllers.RecetaController,
  // @LINE:59
  IngredienteRController_3: controllers.IngredienteRController,
  // @LINE:77
  LibroRecetaController_1: controllers.LibroRecetaController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    Assets_2: controllers.Assets,
    // @LINE:14
    AutorController_4: controllers.AutorController,
    // @LINE:36
    RecetaController_0: controllers.RecetaController,
    // @LINE:59
    IngredienteRController_3: controllers.IngredienteRController,
    // @LINE:77
    LibroRecetaController_1: controllers.LibroRecetaController
  ) = this(errorHandler, Assets_2, AutorController_4, RecetaController_0, IngredienteRController_3, LibroRecetaController_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_2, AutorController_4, RecetaController_0, IngredienteRController_3, LibroRecetaController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """autor/""", """controllers.AutorController.crearAutor()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """autor/""" + "$" + """id<[^/]+>""", """controllers.AutorController.consultarAutor(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """autor/byName/""" + "$" + """name<[^/]+>""", """controllers.AutorController.consultarAutorPorNombre(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """autores""", """controllers.AutorController.listarAutores"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """autor/""" + "$" + """id<[^/]+>/""" + "$" + """nuevoNombre<[^/]+>""", """controllers.AutorController.actualizarAutor(id:Integer, nuevoNombre:String, nuevaEdad:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """autor/""" + "$" + """id<[^/]+>""", """controllers.AutorController.borrarAutor(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/""", """controllers.RecetaController.crearReceta()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/byName/""" + "$" + """name<[^/]+>""", """controllers.RecetaController.consultarRecetaPorNombre(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/byAuthorName/""" + "$" + """name<[^/]+>""", """controllers.RecetaController.consultarRecetasAutor(name:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/""" + "$" + """id<[^/]+>""", """controllers.RecetaController.actualizaReceta(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/""", """controllers.RecetaController.borrarReceta(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingrediente/""", """controllers.IngredienteRController.crearIngrediente()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingrediente/""" + "$" + """id<[^/]+>""", """controllers.IngredienteRController.consultarIngrediente(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingrediente/byName/""" + "$" + """name<[^/]+>""", """controllers.IngredienteRController.consultarIngredientePorNombre(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredientes""", """controllers.IngredienteRController.listarIngredientes"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingrediente/""" + "$" + """id<[^/]+>""", """controllers.IngredienteRController.borrarIngrediente(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """libroreceta/""", """controllers.LibroRecetaController.crearLibroReceta()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """libroreceta/""" + "$" + """id<[^/]+>""", """controllers.LibroRecetaController.consultarLibroReceta(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """libroreceta/byName/""" + "$" + """name<[^/]+>""", """controllers.LibroRecetaController.consultarLibroRecetaPorNombre(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """libroreceta""", """controllers.LibroRecetaController.listarLibroRecetas"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """libroreceta/""" + "$" + """id<[^/]+>""", """controllers.LibroRecetaController.borrarLibroReceta(id:Integer)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_AutorController_crearAutor1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("autor/")))
  )
  private[this] lazy val controllers_AutorController_crearAutor1_invoker = createInvoker(
    AutorController_4.crearAutor(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AutorController",
      "crearAutor",
      Nil,
      "POST",
      this.prefix + """autor/""",
      """ CREAR UN AUTOR curl --verbose -X POST -H "Accept: application/json" -H "Content-Type: application/json" -d '{"nombre": "Luis", "edad": 13, "libroRecetas":[{"nombre":"miLibro","web":"www.lino.com"}]}' "http://localhost:9000/autor/"""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_AutorController_consultarAutor2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("autor/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AutorController_consultarAutor2_invoker = createInvoker(
    AutorController_4.consultarAutor(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AutorController",
      "consultarAutor",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """autor/""" + "$" + """id<[^/]+>""",
      """ CONSULTAR UN AUTOR curl --verbose -X GET http://localhost:9000/autor/1""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_AutorController_consultarAutorPorNombre3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("autor/byName/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AutorController_consultarAutorPorNombre3_invoker = createInvoker(
    AutorController_4.consultarAutorPorNombre(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AutorController",
      "consultarAutorPorNombre",
      Seq(classOf[String]),
      "GET",
      this.prefix + """autor/byName/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_AutorController_listarAutores4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("autores")))
  )
  private[this] lazy val controllers_AutorController_listarAutores4_invoker = createInvoker(
    AutorController_4.listarAutores,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AutorController",
      "listarAutores",
      Nil,
      "GET",
      this.prefix + """autores""",
      """ LISTAR AUTORES curl --verbose -X GET -H "Accept: application/xml" http://localhost:9000/autores""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_AutorController_actualizarAutor5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("autor/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("nuevoNombre", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AutorController_actualizarAutor5_invoker = createInvoker(
    AutorController_4.actualizarAutor(fakeValue[Integer], fakeValue[String], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AutorController",
      "actualizarAutor",
      Seq(classOf[Integer], classOf[String], classOf[Integer]),
      "PUT",
      this.prefix + """autor/""" + "$" + """id<[^/]+>/""" + "$" + """nuevoNombre<[^/]+>""",
      """ ACTUALIZAR AUTOR curl --verbose -X PUT -H "Accept: application/json" http://localhost:9000/autor/1/Antonio/34""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_AutorController_borrarAutor6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("autor/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AutorController_borrarAutor6_invoker = createInvoker(
    AutorController_4.borrarAutor(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AutorController",
      "borrarAutor",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """autor/""" + "$" + """id<[^/]+>""",
      """ BORRAR UN AUTOR curl --verbose -X GET http://localhost:9000/autor/1""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_RecetaController_crearReceta7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/")))
  )
  private[this] lazy val controllers_RecetaController_crearReceta7_invoker = createInvoker(
    RecetaController_0.crearReceta(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetaController",
      "crearReceta",
      Nil,
      "POST",
      this.prefix + """receta/""",
      """ CREAR UNA RECETA
curl --verbose -X POST -H "Accept: application/json" -H "Content-Type: application/json" -d '{"titulo": "Pizza", "ingredientes": [{"nombre": "Mozzarella", "cantidad": "100 gr"}, {"nombre": "Tomate", "cantidad": "150 gr"}], "autor": {"nombre": "Lino", "edad": 20}, "preparacion": "Horno 220 20 min" }' "http://localhost:9000/receta/"""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_RecetaController_consultarRecetaPorNombre8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/byName/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetaController_consultarRecetaPorNombre8_invoker = createInvoker(
    RecetaController_0.consultarRecetaPorNombre(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetaController",
      "consultarRecetaPorNombre",
      Seq(classOf[String]),
      "GET",
      this.prefix + """receta/byName/""" + "$" + """name<[^/]+>""",
      """ CONSULTAR UNA RECETA POR NOMBRE
 curl --verbose -X GET http://localhost:9000/receta/byName/Pizza""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_RecetaController_consultarRecetasAutor9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/byAuthorName/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetaController_consultarRecetasAutor9_invoker = createInvoker(
    RecetaController_0.consultarRecetasAutor(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetaController",
      "consultarRecetasAutor",
      Seq(classOf[String]),
      "GET",
      this.prefix + """receta/byAuthorName/""" + "$" + """name<[^/]+>""",
      """ CONSULTAR UNA RECETA POR NOMBREAUTOR
 curl --verbose -X GET http://localhost:9000/receta/byAuthorName/Lino""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_RecetaController_actualizaReceta10_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetaController_actualizaReceta10_invoker = createInvoker(
    RecetaController_0.actualizaReceta(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetaController",
      "actualizaReceta",
      Seq(classOf[Integer]),
      "PATCH",
      this.prefix + """receta/""" + "$" + """id<[^/]+>""",
      """ ACTUALIZAR UNA RECETA
 curl --verbose -X POST -H "Accept: application/json" -H "Content-Type: application/json" -d '{"titulo": "Piza", "ingredientes": [{"nombre": "Mozzarella", "cantidad": "150 gr"}, {"nombre": "Pomodoro", "cantidad": "200 gr"}], "autor": {"nombre": "Lino", "edad": 40}, "preparacion": "Horno 210 25 min" }' "http://localhost:9000/receta/"""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_RecetaController_borrarReceta11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/")))
  )
  private[this] lazy val controllers_RecetaController_borrarReceta11_invoker = createInvoker(
    RecetaController_0.borrarReceta(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetaController",
      "borrarReceta",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """receta/""",
      """ BORRAR UNA RECETA""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_IngredienteRController_crearIngrediente12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingrediente/")))
  )
  private[this] lazy val controllers_IngredienteRController_crearIngrediente12_invoker = createInvoker(
    IngredienteRController_3.crearIngrediente(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredienteRController",
      "crearIngrediente",
      Nil,
      "POST",
      this.prefix + """ingrediente/""",
      """ CREAR UN INGREDIENTE
curl --verbose -X POST -H "Accept: application/json" -H "Content-Type: application/json" -d '{"nombre": "mozzarella", "cantidad": "150gr"}' "http://localhost:9000/ingrediente/"""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_IngredienteRController_consultarIngrediente13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingrediente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IngredienteRController_consultarIngrediente13_invoker = createInvoker(
    IngredienteRController_3.consultarIngrediente(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredienteRController",
      "consultarIngrediente",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """ingrediente/""" + "$" + """id<[^/]+>""",
      """ CONSULTAR UN INGREDIENTE""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_IngredienteRController_consultarIngredientePorNombre14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingrediente/byName/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IngredienteRController_consultarIngredientePorNombre14_invoker = createInvoker(
    IngredienteRController_3.consultarIngredientePorNombre(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredienteRController",
      "consultarIngredientePorNombre",
      Seq(classOf[String]),
      "GET",
      this.prefix + """ingrediente/byName/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_IngredienteRController_listarIngredientes15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredientes")))
  )
  private[this] lazy val controllers_IngredienteRController_listarIngredientes15_invoker = createInvoker(
    IngredienteRController_3.listarIngredientes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredienteRController",
      "listarIngredientes",
      Nil,
      "GET",
      this.prefix + """ingredientes""",
      """ LISTAR INGREDIENTES""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_IngredienteRController_borrarIngrediente16_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingrediente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IngredienteRController_borrarIngrediente16_invoker = createInvoker(
    IngredienteRController_3.borrarIngrediente(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredienteRController",
      "borrarIngrediente",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """ingrediente/""" + "$" + """id<[^/]+>""",
      """ BORRAR UN INGREDIENTE""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_LibroRecetaController_crearLibroReceta17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("libroreceta/")))
  )
  private[this] lazy val controllers_LibroRecetaController_crearLibroReceta17_invoker = createInvoker(
    LibroRecetaController_1.crearLibroReceta(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LibroRecetaController",
      "crearLibroReceta",
      Nil,
      "POST",
      this.prefix + """libroreceta/""",
      """ CREAR UN LIBRORECETA curl --verbose -X POST -H "Accept: application/json" -H "Content-Type: application/json" -d '{"nombre": "otrolibro", "www.gg.com","edad":23}]}' "http://localhost:9000/libroreceta/"""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val controllers_LibroRecetaController_consultarLibroReceta18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("libroreceta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LibroRecetaController_consultarLibroReceta18_invoker = createInvoker(
    LibroRecetaController_1.consultarLibroReceta(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LibroRecetaController",
      "consultarLibroReceta",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """libroreceta/""" + "$" + """id<[^/]+>""",
      """ CONSULTAR UN LIBRORECETA""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val controllers_LibroRecetaController_consultarLibroRecetaPorNombre19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("libroreceta/byName/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LibroRecetaController_consultarLibroRecetaPorNombre19_invoker = createInvoker(
    LibroRecetaController_1.consultarLibroRecetaPorNombre(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LibroRecetaController",
      "consultarLibroRecetaPorNombre",
      Seq(classOf[String]),
      "GET",
      this.prefix + """libroreceta/byName/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:84
  private[this] lazy val controllers_LibroRecetaController_listarLibroRecetas20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("libroreceta")))
  )
  private[this] lazy val controllers_LibroRecetaController_listarLibroRecetas20_invoker = createInvoker(
    LibroRecetaController_1.listarLibroRecetas,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LibroRecetaController",
      "listarLibroRecetas",
      Nil,
      "GET",
      this.prefix + """libroreceta""",
      """ LISTAR LIBRORECETA""",
      Seq()
    )
  )

  // @LINE:87
  private[this] lazy val controllers_LibroRecetaController_borrarLibroReceta21_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("libroreceta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LibroRecetaController_borrarLibroReceta21_invoker = createInvoker(
    LibroRecetaController_1.borrarLibroReceta(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LibroRecetaController",
      "borrarLibroReceta",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """libroreceta/""" + "$" + """id<[^/]+>""",
      """ BORRAR UN LIBRORECETA""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_AutorController_crearAutor1_route(params@_) =>
      call { 
        controllers_AutorController_crearAutor1_invoker.call(AutorController_4.crearAutor())
      }
  
    // @LINE:17
    case controllers_AutorController_consultarAutor2_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_AutorController_consultarAutor2_invoker.call(AutorController_4.consultarAutor(id))
      }
  
    // @LINE:18
    case controllers_AutorController_consultarAutorPorNombre3_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_AutorController_consultarAutorPorNombre3_invoker.call(AutorController_4.consultarAutorPorNombre(name))
      }
  
    // @LINE:22
    case controllers_AutorController_listarAutores4_route(params@_) =>
      call { 
        controllers_AutorController_listarAutores4_invoker.call(AutorController_4.listarAutores)
      }
  
    // @LINE:25
    case controllers_AutorController_actualizarAutor5_route(params@_) =>
      call(params.fromPath[Integer]("id", None), params.fromPath[String]("nuevoNombre", None), params.fromQuery[Integer]("nuevaEdad", None)) { (id, nuevoNombre, nuevaEdad) =>
        controllers_AutorController_actualizarAutor5_invoker.call(AutorController_4.actualizarAutor(id, nuevoNombre, nuevaEdad))
      }
  
    // @LINE:28
    case controllers_AutorController_borrarAutor6_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_AutorController_borrarAutor6_invoker.call(AutorController_4.borrarAutor(id))
      }
  
    // @LINE:36
    case controllers_RecetaController_crearReceta7_route(params@_) =>
      call { 
        controllers_RecetaController_crearReceta7_invoker.call(RecetaController_0.crearReceta())
      }
  
    // @LINE:40
    case controllers_RecetaController_consultarRecetaPorNombre8_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecetaController_consultarRecetaPorNombre8_invoker.call(RecetaController_0.consultarRecetaPorNombre(name))
      }
  
    // @LINE:44
    case controllers_RecetaController_consultarRecetasAutor9_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecetaController_consultarRecetasAutor9_invoker.call(RecetaController_0.consultarRecetasAutor(name))
      }
  
    // @LINE:48
    case controllers_RecetaController_actualizaReceta10_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RecetaController_actualizaReceta10_invoker.call(RecetaController_0.actualizaReceta(id))
      }
  
    // @LINE:51
    case controllers_RecetaController_borrarReceta11_route(params@_) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_RecetaController_borrarReceta11_invoker.call(RecetaController_0.borrarReceta(id))
      }
  
    // @LINE:59
    case controllers_IngredienteRController_crearIngrediente12_route(params@_) =>
      call { 
        controllers_IngredienteRController_crearIngrediente12_invoker.call(IngredienteRController_3.crearIngrediente())
      }
  
    // @LINE:62
    case controllers_IngredienteRController_consultarIngrediente13_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_IngredienteRController_consultarIngrediente13_invoker.call(IngredienteRController_3.consultarIngrediente(id))
      }
  
    // @LINE:63
    case controllers_IngredienteRController_consultarIngredientePorNombre14_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_IngredienteRController_consultarIngredientePorNombre14_invoker.call(IngredienteRController_3.consultarIngredientePorNombre(name))
      }
  
    // @LINE:66
    case controllers_IngredienteRController_listarIngredientes15_route(params@_) =>
      call { 
        controllers_IngredienteRController_listarIngredientes15_invoker.call(IngredienteRController_3.listarIngredientes)
      }
  
    // @LINE:69
    case controllers_IngredienteRController_borrarIngrediente16_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_IngredienteRController_borrarIngrediente16_invoker.call(IngredienteRController_3.borrarIngrediente(id))
      }
  
    // @LINE:77
    case controllers_LibroRecetaController_crearLibroReceta17_route(params@_) =>
      call { 
        controllers_LibroRecetaController_crearLibroReceta17_invoker.call(LibroRecetaController_1.crearLibroReceta())
      }
  
    // @LINE:80
    case controllers_LibroRecetaController_consultarLibroReceta18_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_LibroRecetaController_consultarLibroReceta18_invoker.call(LibroRecetaController_1.consultarLibroReceta(id))
      }
  
    // @LINE:81
    case controllers_LibroRecetaController_consultarLibroRecetaPorNombre19_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LibroRecetaController_consultarLibroRecetaPorNombre19_invoker.call(LibroRecetaController_1.consultarLibroRecetaPorNombre(name))
      }
  
    // @LINE:84
    case controllers_LibroRecetaController_listarLibroRecetas20_route(params@_) =>
      call { 
        controllers_LibroRecetaController_listarLibroRecetas20_invoker.call(LibroRecetaController_1.listarLibroRecetas)
      }
  
    // @LINE:87
    case controllers_LibroRecetaController_borrarLibroReceta21_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_LibroRecetaController_borrarLibroReceta21_invoker.call(LibroRecetaController_1.borrarLibroReceta(id))
      }
  }
}
