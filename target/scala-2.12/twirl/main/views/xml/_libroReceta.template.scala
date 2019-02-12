
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

object _libroReceta extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[LibroReceta,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(libroReceta: LibroReceta):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<LibroReceta>
    <name>"""),_display_(/*3.12*/libroReceta/*3.23*/.getNombre()),format.raw/*3.35*/("""</name>
</LibroReceta>"""))
      }
    }
  }

  def render(libroReceta:LibroReceta): play.twirl.api.XmlFormat.Appendable = apply(libroReceta)

  def f:((LibroReceta) => play.twirl.api.XmlFormat.Appendable) = (libroReceta) => apply(libroReceta)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Feb 07 12:40:30 CET 2019
                  SOURCE: /Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/play-sample/app/views/_libroReceta.scala.xml
                  HASH: 39d8d941379f10152b15582ab2450cae888334be
                  MATRIX: 954->1|1073->28|1124->53|1143->64|1175->76
                  LINES: 28->1|33->2|34->3|34->3|34->3
                  -- GENERATED --
              */
          