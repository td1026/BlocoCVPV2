
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registar_Scope0 {
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

class registar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(erro:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""

"""),_display_(/*3.2*/main("Registar")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<div class="register-box">
      <div class="register-logo">
        <b>Registos</b>PMA
      </div>

      <div class="register-box-body">
        <p class="login-box-msg">Registar Novo Utilizador</p>
        <form name="myForm" onsubmit="return validateForm()">
          <div class="form-group has-feedback">
            <input name="name" type="text" class="form-control" placeholder="Nome Completo" required>
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
            <div class="form-group has-feedback">
                <input name="username"type="text" class="form-control" placeholder="Nome de Utilizador" required>
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
          <div class="form-group has-feedback">
            <input type="email" name="email" class="form-control" placeholder="Email" required>
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
          """),_display_(/*24.12*/if(erro!="")/*24.24*/{_display_(Seq[Any](format.raw/*24.25*/("""
            """),format.raw/*25.13*/("""<div class="callout callout-warning">
                <p>"""),_display_(/*26.21*/erro),format.raw/*26.25*/("""</p>
            </div>
          """)))}),format.raw/*28.12*/("""
          """),format.raw/*29.11*/("""<div class="row">
            <div class="col-xs-8">
            </div><!-- /.col -->

            <div class="col-xs-4">
              <button type="submit" class="btn btn-primary btn-block btn-flat">Registar</button>
            </div><!-- /.col -->
          </div>
        </form>
        <a href="/login" class="text-center">Login</a>
      </div><!-- /.form-box -->
    </div><!-- /.register-box -->
""")))}))
      }
    }
  }

  def render(erro:String): play.twirl.api.HtmlFormat.Appendable = apply(erro)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (erro) => apply(erro)

  def ref: this.type = this

}


}

/**/
object registar extends registar_Scope0.registar
              /*
                  -- GENERATED --
                  DATE: Mon Dec 26 18:29:05 WET 2016
                  SOURCE: /home/telmo/dev/AppRegistos/backend/app/views/registar.scala.html
                  HASH: 60da2a4c437d0ca24016c50ef2ace12a54e74814
                  MATRIX: 751->1|859->14|887->17|911->33|950->35|981->40|2045->1077|2066->1089|2105->1090|2146->1103|2231->1161|2256->1165|2322->1200|2361->1211
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|55->24|55->24|55->24|56->25|57->26|57->26|59->28|60->29
                  -- GENERATED --
              */
          