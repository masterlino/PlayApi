
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

object _receta extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template3[Receta,Autor,List[IngredienteR],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(receta: Receta, autor: Autor, ingredientes: List[IngredienteR]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<Receta>
    <Titulo>
        """),_display_(/*4.10*/receta/*4.16*/.getTitulo()),format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""</Titulo>

    """),_display_(/*7.6*/_autor(autor)),format.raw/*7.19*/("""

    """),format.raw/*9.5*/("""<Ingredientes>
        """),_display_(/*10.10*/for(ingrediente <- ingredientes) yield /*10.42*/ {_display_(Seq[Any](format.raw/*10.44*/("""
        """),_display_(/*11.10*/_ingrediente(ingrediente)),format.raw/*11.35*/("""
        """)))}),format.raw/*12.10*/("""
    """),format.raw/*13.5*/("""</Ingredientes>

    <Preparacion>
        """),_display_(/*16.10*/receta/*16.16*/.getPreparacion()),format.raw/*16.33*/("""
    """),format.raw/*17.5*/("""</Preparacion>
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
                  DATE: Fri Feb 08 13:19:03 CET 2019
                  SOURCE: /Users/lino/Documents/Master MIMO/2 Tecnologías del lado del Servidor Cloud computing/Semana 2 3 4/Profe Play Sample/play-sample/app/views/_receta.scala.xml
                  HASH: e4b071cb07473af45c7075a17432342f95117abf
                  MATRIX: 969->1|1126->66|1183->97|1197->103|1229->115|1260->120|1301->136|1334->149|1366->155|1417->179|1465->211|1505->213|1542->223|1588->248|1629->258|1661->263|1732->307|1747->313|1785->330|1817->335
                  LINES: 28->1|33->2|35->4|35->4|35->4|36->5|38->7|38->7|40->9|41->10|41->10|41->10|42->11|42->11|43->12|44->13|47->16|47->16|47->16|48->17
                  -- GENERATED --
              */
          