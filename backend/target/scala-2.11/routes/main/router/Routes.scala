
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/telmo/dev/BlocoCVPV2/backend/conf/routes
// @DATE:Tue Jan 03 16:36:31 WET 2017

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
  // @LINE:13
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_0: controllers.HomeController,
    // @LINE:13
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
    ("""GET""", this.prefix, """controllers.HomeController.getIndex"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/medicamento""", """controllers.HomeController.findMedicamento"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/medicamento/""" + "$" + """id<[^/]+>""", """controllers.HomeController.getMedicamento(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/medicamento""", """controllers.HomeController.updadteMedicamento"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/medicamento""", """controllers.HomeController.createMedicamento"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/medicamento/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteMedicamento(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_getIndex0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_getIndex0_invoker = createInvoker(
    HomeController_0.getIndex,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getIndex",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_HomeController_findMedicamento1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/medicamento")))
  )
  private[this] lazy val controllers_HomeController_findMedicamento1_invoker = createInvoker(
    HomeController_0.findMedicamento,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "findMedicamento",
      Nil,
      "GET",
      """""",
      this.prefix + """api/medicamento"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_getMedicamento2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/medicamento/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getMedicamento2_invoker = createInvoker(
    HomeController_0.getMedicamento(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getMedicamento",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """api/medicamento/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_updadteMedicamento3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/medicamento")))
  )
  private[this] lazy val controllers_HomeController_updadteMedicamento3_invoker = createInvoker(
    HomeController_0.updadteMedicamento,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updadteMedicamento",
      Nil,
      "POST",
      """""",
      this.prefix + """api/medicamento"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_createMedicamento4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/medicamento")))
  )
  private[this] lazy val controllers_HomeController_createMedicamento4_invoker = createInvoker(
    HomeController_0.createMedicamento,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createMedicamento",
      Nil,
      "PUT",
      """""",
      this.prefix + """api/medicamento"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_deleteMedicamento5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/medicamento/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteMedicamento5_invoker = createInvoker(
    HomeController_0.deleteMedicamento(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteMedicamento",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """api/medicamento/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:13
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
    case controllers_HomeController_getIndex0_route(params) =>
      call { 
        controllers_HomeController_getIndex0_invoker.call(HomeController_0.getIndex)
      }
  
    // @LINE:6
    case controllers_HomeController_findMedicamento1_route(params) =>
      call { 
        controllers_HomeController_findMedicamento1_invoker.call(HomeController_0.findMedicamento)
      }
  
    // @LINE:7
    case controllers_HomeController_getMedicamento2_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HomeController_getMedicamento2_invoker.call(HomeController_0.getMedicamento(id))
      }
  
    // @LINE:8
    case controllers_HomeController_updadteMedicamento3_route(params) =>
      call { 
        controllers_HomeController_updadteMedicamento3_invoker.call(HomeController_0.updadteMedicamento)
      }
  
    // @LINE:9
    case controllers_HomeController_createMedicamento4_route(params) =>
      call { 
        controllers_HomeController_createMedicamento4_invoker.call(HomeController_0.createMedicamento)
      }
  
    // @LINE:10
    case controllers_HomeController_deleteMedicamento5_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HomeController_deleteMedicamento5_invoker.call(HomeController_0.deleteMedicamento(id))
      }
  
    // @LINE:13
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
