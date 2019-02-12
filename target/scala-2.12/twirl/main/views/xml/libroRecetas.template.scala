
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

object libroRecetas extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[List[LibroReceta],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(libroRecetas: List[LibroReceta]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""        """),format.raw/*2.9*/("""<?xml version="1.0" encoding="UTF-8"?>
<LibrosRecetas>
    """),_display_(/*4.6*/for(libroReceta <- libroRecetas) yield /*4.38*/ {_display_(Seq[Any](format.raw/*4.40*/("""
    """),_display_(/*5.6*/_libroReceta(libroReceta)),format.raw/*5.31*/("""
    """)))}),format.raw/*6.6*/("""
"""),format.raw/*7.1*/("""</LibrosRecetas>"""))
      }
    }
  }

  def render(libroRecetas:List[LibroReceta]): play.twirl.api.XmlFormat.Appendable = apply(libroRecetas)

  def f:((List[LibroReceta]) => play.twirl.api.XmlFormat.Appendable) = (libroRecetas) => apply(libroRecetas)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Feb 07 12:40:30 CET 2019
                  SOURCE: /Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/play-sample/app/views/libroRecetas.scala.xml
                  HASH: 97cd3624a2640e35d85fd58e28c5426781e51d7d
                  MATRIX: 960->1|1086->35|1120->43|1205->103|1252->135|1291->137|1322->143|1367->168|1402->174|1429->175
                  LINES: 28->1|33->2|33->2|35->4|35->4|35->4|36->5|36->5|37->6|38->7
                  -- GENERATED --
              */
          