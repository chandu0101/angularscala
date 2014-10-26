import com.greencatsoft.angularjs.Angular

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

/**
 * Created by chandrasekharkode on 10/26/14.
 */

@JSExport
object App extends JSApp {
  override def main() {
    val module = Angular.module("angularscala", Seq("ngRoute"))
    module.config(RoutingConfig)
    module.controller(AppCtrl)
  }
}