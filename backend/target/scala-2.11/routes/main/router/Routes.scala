
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/telmo/dev/AppRegistos/backend/conf/routes
// @DATE:Mon Dec 26 18:29:05 WET 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_0: controllers.HomeController,
  // @LINE:14
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_0: controllers.HomeController,
    // @LINE:14
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.getLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.postLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.getLogout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registar""", """controllers.HomeController.getRegistar"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registar""", """controllers.HomeController.postRegistar"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_HomeController_getLogin1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_getLogin1_invoker = createInvoker(
    HomeController_0.getLogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getLogin",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_postLogin2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_postLogin2_invoker = createInvoker(
    HomeController_0.postLogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "postLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_getLogout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_getLogout3_invoker = createInvoker(
    HomeController_0.getLogout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getLogout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_getRegistar4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registar")))
  )
  private[this] lazy val controllers_HomeController_getRegistar4_invoker = createInvoker(
    HomeController_0.getRegistar,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getRegistar",
      Nil,
      "GET",
      """""",
      this.prefix + """registar"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_postRegistar5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registar")))
  )
  private[this] lazy val controllers_HomeController_postRegistar5_invoker = createInvoker(
    HomeController_0.postRegistar,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "postRegistar",
      Nil,
      "POST",
      """""",
      this.prefix + """registar"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:6
    case controllers_HomeController_getLogin1_route(params) =>
      call { 
        controllers_HomeController_getLogin1_invoker.call(HomeController_0.getLogin)
      }
  
    // @LINE:7
    case controllers_HomeController_postLogin2_route(params) =>
      call { 
        controllers_HomeController_postLogin2_invoker.call(HomeController_0.postLogin)
      }
  
    // @LINE:8
    case controllers_HomeController_getLogout3_route(params) =>
      call { 
        controllers_HomeController_getLogout3_invoker.call(HomeController_0.getLogout)
      }
  
    // @LINE:10
    case controllers_HomeController_getRegistar4_route(params) =>
      call { 
        controllers_HomeController_getRegistar4_invoker.call(HomeController_0.getRegistar)
      }
  
    // @LINE:11
    case controllers_HomeController_postRegistar5_route(params) =>
      call { 
        controllers_HomeController_postRegistar5_invoker.call(HomeController_0.postRegistar)
      }
  
    // @LINE:14
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
