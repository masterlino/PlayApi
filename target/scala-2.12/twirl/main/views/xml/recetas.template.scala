
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

object recetas extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[List[Receta],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recetas: List[Receta]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<Recetas>
    """),_display_(/*5.6*/for(receta <- recetas) yield /*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
    """),_display_(/*6.6*/_receta(receta, receta.getAutor(), receta.getIngredientes)),format.raw/*6.64*/("""
    """)))}),format.raw/*7.6*/("""
"""),format.raw/*8.1*/("""</Recetas>
"""))
      }
    }
  }

  def render(recetas:List[Receta]): play.twirl.api.XmlFormat.Appendable = apply(recetas)

  def f:((List[Receta]) => play.twirl.api.XmlFormat.Appendable) = (recetas) => apply(recetas)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Feb 08 13:19:03 CET 2019
                  SOURCE: /Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/play-sample/app/views/recetas.scala.xml
                  HASH: 44ab59ef87fef57721a677cfefafd857e613ab72
                  MATRIX: 950->1|1066->25|1093->26|1172->80|1209->102|1248->104|1279->110|1357->168|1392->174|1419->175
                  LINES: 28->1|33->2|34->3|36->5|36->5|36->5|37->6|37->6|38->7|39->8
                  -- GENERATED --
              */
          