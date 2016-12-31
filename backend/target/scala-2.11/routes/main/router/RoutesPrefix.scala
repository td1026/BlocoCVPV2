
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/telmo/dev/AppRegistos/backend/conf/routes
// @DATE:Mon Dec 26 18:29:05 WET 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
