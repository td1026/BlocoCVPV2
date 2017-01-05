
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
import models.entity.Medicamento

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Medicamento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(list: List[Medicamento]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.27*/("""

"""),_display_(/*5.2*/main("Welcome to Play")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""

    """),format.raw/*7.5*/("""<p>"""),_display_(/*7.9*/list/*7.13*/.size),format.raw/*7.18*/("""</p>
    """),_display_(/*8.6*/for(p <- list) yield /*8.20*/ {_display_(Seq[Any](format.raw/*8.22*/("""
        """),format.raw/*9.9*/("""<p>"""),_display_(/*9.13*/p/*9.14*/.getId),format.raw/*9.20*/("""</p>
    """)))}),format.raw/*10.6*/("""
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(list:List[Medicamento]): play.twirl.api.HtmlFormat.Appendable = apply(list)

  def f:((List[Medicamento]) => play.twirl.api.HtmlFormat.Appendable) = (list) => apply(list)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Tue Jan 03 14:56:41 WET 2017
                  SOURCE: /home/telmo/dev/BlocoCVPV2/backend/app/views/index.scala.html
                  HASH: 4e7ef5df2d693f9d44eb8e7544eed451b6d82696
                  MATRIX: 817->36|937->61|965->64|996->87|1035->89|1067->95|1096->99|1108->103|1133->108|1168->118|1197->132|1236->134|1271->143|1301->147|1310->148|1336->154|1376->164|1408->166
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|41->9|42->10|43->11
                  -- GENERATED --
              */
          