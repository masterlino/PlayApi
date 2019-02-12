
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

object _autor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[Autor,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(autor: Autor):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<autor>
    <nombre>"""),_display_(/*3.14*/autor/*3.19*/.getNombre()),format.raw/*3.31*/("""</nombre>
    <edad>"""),_display_(/*4.12*/autor/*4.17*/.getEdad()),format.raw/*4.27*/("""</edad>
</autor>"""))
      }
    }
  }

  def render(autor:Autor): play.twirl.api.XmlFormat.Appendable = apply(autor)

  def f:((Autor) => play.twirl.api.XmlFormat.Appendable) = (autor) => apply(autor)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 05 13:12:00 CET 2019
                  SOURCE: /Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/play-sample/app/views/_autor.scala.xml
                  HASH: 5b3fbbaa5ebada55f92dee129f8fe56b356ce3ee
                  MATRIX: 942->1|1049->16|1096->37|1109->42|1141->54|1188->75|1201->80|1231->90
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4
                  -- GENERATED --
              */
          