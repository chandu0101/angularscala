package com.chandu0101.controllers

import com.greencatsoft.angularjs.Controller
import com.greencatsoft.angularjs.core.Scope

import scala.scalajs.js.annotation.JSExport

/**
 * Created by chandrasekharkode on 10/26/14.
 */
@JSExport
object PanelController extends Controller {

  override val name = "panelCtrl"

  override def initialize(scope: ScopeType) = {
    scope.tab = 1
  }

  @JSExport
  def selectTab(num: Int) = {
    scope.tab = num
  }

  @JSExport
  def isSelected(num: Int) = {
    num == scope.tab
  }

  trait ScopeType extends Scope {
    var tab: Int
  }

}
