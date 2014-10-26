import com.greencatsoft.angularjs.core.{Route, RouteProvider}
import com.greencatsoft.angularjs.{Config, inject}

/**
 * Created by chandrasekharkode on 10/26/14.
 */
object RoutingConfig extends Config {

  @inject
  var routeProvider: RouteProvider = _
   override  def initialize() {
    routeProvider
      .when("/", Route("index.html","Home"))
      .when("/hello",Route("hello.html","Hello"))
  }
}
