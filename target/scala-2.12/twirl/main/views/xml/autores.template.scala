
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

object autores extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[List[Autor],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(autores: List[Autor]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""        """),format.raw/*2.9*/("""<?xml version="1.0" encoding="UTF-8"?>
<autores>
    """),_display_(/*4.6*/for(autor <- autores) yield /*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
    """),_display_(/*5.6*/_autor(autor)),format.raw/*5.19*/("""
    """)))}),format.raw/*6.6*/("""
"""),format.raw/*7.1*/("""</autores>"""))
      }
    }
  }

  def render(autores:List[Autor]): play.twirl.api.XmlFormat.Appendable = apply(autores)

  def f:((List[Autor]) => play.twirl.api.XmlFormat.Appendable) = (autores) => apply(autores)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jan 30 18:00:37 CET 2019
                  SOURCE: /Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/play-sample/app/views/autores.scala.xml
                  HASH: 77aea2ff063f2f7746ffd2449d2a7fe746bf46da
                  MATRIX: 949->1|1064->24|1098->32|1177->86|1213->107|1252->109|1283->115|1316->128|1351->134|1378->135
                  LINES: 28->1|33->2|33->2|35->4|35->4|35->4|36->5|36->5|37->6|38->7
                  -- GENERATED --
              */
          