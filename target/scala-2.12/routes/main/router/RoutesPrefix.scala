// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/Play-Entrega/conf/routes
// @DATE:Mon Feb 18 12:49:43 CET 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
