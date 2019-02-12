
package views.xml

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.xml._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object receta extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template3[Receta,Autor,List[IngredienteR],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(receta: Receta, autor: Autor, ingredientes: List[IngredienteR]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<Receta>
    <Titulo>
        """),_display_(/*6.10*/receta/*6.16*/.getTitulo()),format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""</Titulo>

    """),_display_(/*9.6*/_autor(autor)),format.raw/*9.19*/("""

    """),format.raw/*11.5*/("""<Ingredientes>
        """),_display_(/*12.10*/for(ingrediente <- ingredientes) yield /*12.42*/ {_display_(Seq[Any](format.raw/*12.44*/("""
        """),_display_(/*13.10*/_ingrediente(ingrediente)),format.raw/*13.35*/("""
        """)))}),format.raw/*14.10*/("""
    """),format.raw/*15.5*/("""</Ingredientes>

    <Preparacion>
        """),_display_(/*18.10*/receta/*18.16*/.getPreparacion()),format.raw/*18.33*/("""
    """),format.raw/*19.5*/("""</Preparacion>
</Receta>
"""))
      }
    }
  }

  def render(receta:Receta,autor:Autor,ingredientes:List[IngredienteR]): play.twirl.api.XmlFormat.Appendable = apply(receta,autor,ingredientes)

  def f:((Receta,Autor,List[IngredienteR]) => play.twirl.api.XmlFormat.Appendable) = (receta,autor,ingredientes) => apply(receta,autor,ingredientes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Feb 07 17:35:11 CET 2019
                  SOURCE: /Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/play-sample/app/views/receta.scala.xml
                  HASH: 536073ac85636423a93d53eea30b6a522737ce2b
                  MATRIX: 968->1|1125->66|1152->67|1248->137|1262->143|1294->155|1325->160|1366->176|1399->189|1432->195|1483->219|1531->251|1571->253|1608->263|1654->288|1695->298|1727->303|1798->347|1813->353|1851->370|1883->375
                  LINES: 28->1|33->2|34->3|37->6|37->6|37->6|38->7|40->9|40->9|42->11|43->12|43->12|43->12|44->13|44->13|45->14|46->15|49->18|49->18|49->18|50->19
                  -- GENERATED --
              */
          