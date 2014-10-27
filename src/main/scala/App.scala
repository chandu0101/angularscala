import com.chandu0101.controllers.{ReviewController, PanelController, StoreController}
import com.chandu0101.routers.StoreRouter
import com.chandu0101.services.StoreServiceFactory
import com.greencatsoft.angularjs.Angular

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

/**
  * Created by chandrasekharkode on 10/26/14.
  */

object App extends JSApp {
   override def main() {
     val module = Angular.module("store")
    // module.config(StoreRouter)
     module.controller(StoreController)
     module.controller(PanelController)
     module.controller(ReviewController)
     module.factory(StoreServiceFactory)
   }
 }