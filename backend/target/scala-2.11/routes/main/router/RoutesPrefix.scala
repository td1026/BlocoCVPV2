
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/telmo/dev/BlocoCVPV2/backend/conf/routes
// @DATE:Tue Jan 03 16:36:31 WET 2017


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
