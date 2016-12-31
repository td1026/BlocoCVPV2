
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object index_Scope1 {
import models.entity.Utilizador

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Utilizador],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(list: List[Utilizador]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.26*/("""

"""),_display_(/*5.2*/main("Welcome to Play")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""

    """),_display_(/*7.6*/for(p <- list) yield /*7.20*/ {_display_(Seq[Any](format.raw/*7.22*/("""
        """),format.raw/*8.9*/("""<p>"""),_display_(/*8.13*/p/*8.14*/.getID),format.raw/*8.20*/(""" """),_display_(/*8.22*/p/*8.23*/.getName),format.raw/*8.31*/(""" """),_display_(/*8.33*/p/*8.34*/.getUsername),format.raw/*8.46*/(""" """),_display_(/*8.48*/p/*8.49*/.getPassword),format.raw/*8.61*/("""</p>
    """)))}),format.raw/*9.6*/("""
""")))}))
      }
    }
  }

  def render(list:List[Utilizador]): play.twirl.api.HtmlFormat.Appendable = apply(list)

  def f:((List[Utilizador]) => play.twirl.api.HtmlFormat.Appendable) = (list) => apply(list)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Mon Dec 26 18:29:05 WET 2016
                  SOURCE: /home/telmo/dev/AppRegistos/backend/app/views/index.scala.html
                  HASH: 0bc318be05e0cd6fa736ca8c73dca5cc0e538d87
                  MATRIX: 815->35|934->59|962->62|993->85|1032->87|1064->94|1093->108|1132->110|1167->119|1197->123|1206->124|1232->130|1260->132|1269->133|1297->141|1325->143|1334->144|1366->156|1394->158|1403->159|1435->171|1474->181
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|39->7|39->7|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|41->9
                  -- GENERATED --
              */
          