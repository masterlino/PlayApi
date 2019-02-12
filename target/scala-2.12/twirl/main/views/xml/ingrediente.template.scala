
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

object ingrediente extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[IngredienteR,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ingrediente: IngredienteR):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""        """),format.raw/*2.9*/("""<?xml version="1.0" encoding="UTF-8"?>
        """),_display_(/*3.10*/_ingrediente(ingrediente)))
      }
    }
  }

  def render(ingrediente:IngredienteR): play.twirl.api.XmlFormat.Appendable = apply(ingrediente)

  def f:((IngredienteR) => play.twirl.api.XmlFormat.Appendable) = (ingrediente) => apply(ingrediente)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Feb 01 13:39:35 CET 2019
                  SOURCE: /Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/play-sample/app/views/ingrediente.scala.xml
                  HASH: f96babfc49e8279c639ce917d1c5dc280fc322d5
                  MATRIX: 953->1|1072->28|1106->36|1180->84
                  LINES: 28->1|33->2|33->2|34->3
                  -- GENERATED --
              */
          