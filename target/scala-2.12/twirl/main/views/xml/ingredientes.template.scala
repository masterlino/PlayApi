
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

object ingredientes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[List[IngredienteR],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ingredientes: List[IngredienteR]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""        """),format.raw/*2.9*/("""<?xml version="1.0" encoding="UTF-8"?>
<Ingredientes>
    """),_display_(/*4.6*/for(ingrediente <- ingredientes) yield /*4.38*/ {_display_(Seq[Any](format.raw/*4.40*/("""
    """),_display_(/*5.6*/_ingrediente(ingrediente)),format.raw/*5.31*/("""
    """)))}),format.raw/*6.6*/("""
"""),format.raw/*7.1*/("""</Ingredientes>"""))
      }
    }
  }

  def render(ingredientes:List[IngredienteR]): play.twirl.api.XmlFormat.Appendable = apply(ingredientes)

  def f:((List[IngredienteR]) => play.twirl.api.XmlFormat.Appendable) = (ingredientes) => apply(ingredientes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Feb 01 13:39:36 CET 2019
                  SOURCE: /Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/play-sample/app/views/ingredientes.scala.xml
                  HASH: f61cc799c2f8fc7e6fc7b5a77c328e4de65e9485
                  MATRIX: 960->1|1086->35|1120->43|1204->102|1251->134|1290->136|1321->142|1366->167|1401->173|1428->174
                  LINES: 28->1|33->2|33->2|35->4|35->4|35->4|36->5|36->5|37->6|38->7
                  -- GENERATED --
              */
          