
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(erro:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""

"""),_display_(/*3.2*/main("Login")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
  """),format.raw/*4.3*/("""<div class="login-box">
    <div class="login-logo">
      <b>Registos</b>PMA
    </div><!-- /.login-logo -->
    <div class="login-box-body">
      <p class="login-box-msg"></p>
      <form action="/login" method="post">
        <div class="form-group has-feedback">
          <input type="text" class="form-control"
                 placeholder="Utilizador"
                 name="nome">
          <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
        </div>
        <div class="form-group has-feedback">
          <input type="password" class="form-control"
                 placeholder="Senha"
                 name="password">
          <span class="glyphicon glyphicon-lock form-control-feedback"></span>
        </div>
        <div class="row">
          <div class="col-xs-8">
              <Label style="color: red" > """),_display_(/*25.44*/erro),format.raw/*25.48*/(""" """),format.raw/*25.49*/("""</Label>
          </div><!-- /.col -->
          <div class="col-xs-4">
            <button type="submit" class="btn btn-primary btn-block btn-flat">Login</button>
          </div><!-- /.col -->
        </div>
      </form>
      <a href="#">Recuperar senha</a><br>
      <a href='/registar' class="text-center">Registar</a>
    </div><!-- /.login-box-body -->
  </div><!-- /.login-box -->

  <script>
          $(function () """),format.raw/*38.25*/("""{"""),format.raw/*38.26*/("""
            """),format.raw/*39.13*/("""$('input').iCheck("""),format.raw/*39.31*/("""{"""),format.raw/*39.32*/("""
              """),format.raw/*40.15*/("""checkboxClass: 'icheckbox_square-blue',
              radioClass: 'iradio_square-blue',
              increaseArea: '20%' // optional
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/(""");
          """),format.raw/*44.11*/("""}"""),format.raw/*44.12*/(""");
  </script>
""")))}),format.raw/*46.2*/("""
"""))
      }
    }
  }

  def render(erro:String): play.twirl.api.HtmlFormat.Appendable = apply(erro)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (erro) => apply(erro)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Mon Dec 26 22:06:21 WET 2016
                  SOURCE: /home/telmo/dev/AppRegistos/backend/app/views/login.scala.html
                  HASH: 9cd5839e955b9263416a63696422ee4f6c113caf
                  MATRIX: 745->1|853->14|881->17|902->30|941->32|970->35|1852->890|1877->894|1906->895|2361->1322|2390->1323|2431->1336|2477->1354|2506->1355|2549->1370|2723->1516|2752->1517|2793->1530|2822->1531|2868->1547
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|56->25|56->25|56->25|69->38|69->38|70->39|70->39|70->39|71->40|74->43|74->43|75->44|75->44|77->46
                  -- GENERATED --
              */
          