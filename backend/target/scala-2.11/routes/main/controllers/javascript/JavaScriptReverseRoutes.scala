
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/telmo/dev/BlocoCVPV2/backend/conf/routes
// @DATE:Tue Jan 03 16:36:31 WET 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def updadteMedicamento: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updadteMedicamento",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/medicamento"})
        }
      """
    )
  
    // @LINE:10
    def deleteMedicamento: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteMedicamento",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/medicamento/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:7
    def getMedicamento: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getMedicamento",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/medicamento/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:5
    def getIndex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getIndex",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def createMedicamento: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createMedicamento",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/medicamento"})
        }
      """
    )
  
    // @LINE:6
    def findMedicamento: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.findMedicamento",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/medicamento"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
