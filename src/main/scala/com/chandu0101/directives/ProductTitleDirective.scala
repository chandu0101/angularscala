package com.chandu0101.directives

import com.greencatsoft.angularjs.{ElementDirective, IsolatedScope, TemplatedDirective}

import scala.scalajs.js.annotation.JSExport

/**
 * Created by chandrasekharkode on 10/27/14.
 */
@JSExport
object ProductTitleDirective extends ElementDirective with TemplatedDirective with IsolatedScope {
  override val templateUrl: String = "product-title.html"
  override val name = "productTitle"
}
