package com.chandu0101.controllers

import com.chandu0101.model.Product
import com.chandu0101.services.StoreService
import com.greencatsoft.angularjs.core.Scope
import com.greencatsoft.angularjs.{Controller, inject}

import scala.scalajs.js.JSConverters._
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js


/**
 * Created by chandrasekharkode on 10/26/14.
 */

@JSExport
object StoreController extends Controller {

  override val name = "storeCtrl"
  override type ScopeType = StoreForm

  @inject
  var service: StoreService = _

  override def initialize(scope: ScopeType) = {
    scope.products = service.findAll().toJSArray
  }

  trait StoreForm extends Scope {
    var products: js.Array[Product]
  }

}
