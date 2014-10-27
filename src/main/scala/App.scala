import com.chandu0101.controllers.{PanelController, ReviewController, StoreController}
import com.chandu0101.directives.ProductTitleDirective
import com.chandu0101.services.StoreServiceFactory
import com.greencatsoft.angularjs.Angular

import scala.scalajs.js.JSApp

/**
 * Created by chandrasekharkode on 10/26/14.
 */

object App extends JSApp {
  override def main() {
    val module = Angular.module("store")
    module.directive(ProductTitleDirective)
    module.controller(StoreController)
    module.controller(PanelController)
    module.controller(ReviewController)
    module.factory(StoreServiceFactory)
  }
}