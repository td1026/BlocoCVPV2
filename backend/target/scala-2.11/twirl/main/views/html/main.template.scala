
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">


        <title>"""),_display_(/*12.17*/title),format.raw/*12.22*/("""</title>

        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*16.70*/("""" type="text/javascript"></script>


        <!-- Bootstrap 3.3.5 -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*20.54*/routes/*20.60*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*20.112*/("""">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*26.54*/routes/*26.60*/.Assets.versioned("dist/css/AdminLTE.min.css")),format.raw/*26.106*/("""">
        <!-- iCheck -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*28.54*/routes/*28.60*/.Assets.versioned("plugins/iCheck/square/blue.css")),format.raw/*28.111*/("""">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- jQuery 2.1.4 -->
        <script src=""""),_display_(/*38.23*/routes/*38.29*/.Assets.versioned("plugins/jQuery/jQuery-2.1.4.min.js")),format.raw/*38.84*/("""" type="text/javascript"></script>
        <!-- Bootstrap 3.3.5 -->
        <script src=""""),_display_(/*40.23*/routes/*40.29*/.Assets.versioned("jbootstrap/js/bootstrap.min.js")),format.raw/*40.80*/("""" type="text/javascript"></script>
        <!-- iCheck -->
        <script src=""""),_display_(/*42.23*/routes/*42.29*/.Assets.versioned("plugins/iCheck/icheck.min.js")),format.raw/*42.78*/("""" type="text/javascript"></script>

    </head>
    <body class="hold-transition login-page">
        """),_display_(/*46.10*/content),format.raw/*46.17*/("""
    """),format.raw/*47.5*/("""</body>
</html>


"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Jan 03 14:53:00 WET 2017
                  SOURCE: /home/telmo/dev/BlocoCVPV2/backend/app/views/main.scala.html
                  HASH: 1b83a43fc94ae0e386627a34b1c3dbba1af4321c
                  MATRIX: 748->1|873->31|901->33|1262->367|1288->372|1378->435|1393->441|1456->482|1544->543|1559->549|1620->588|1672->613|1687->619|1749->660|1899->783|1914->789|1988->841|2378->1204|2393->1210|2461->1256|2568->1336|2583->1342|2656->1393|3141->1851|3156->1857|3232->1912|3349->2002|3364->2008|3436->2059|3544->2140|3559->2146|3629->2195|3759->2298|3787->2305|3819->2310
                  LINES: 27->1|32->1|34->3|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|51->20|51->20|51->20|57->26|57->26|57->26|59->28|59->28|59->28|69->38|69->38|69->38|71->40|71->40|71->40|73->42|73->42|73->42|77->46|77->46|78->47
                  -- GENERATED --
              */
          