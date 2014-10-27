package com.chandu0101.controllers

import com.chandu0101.model.{Review, Review2, Product}
import com.greencatsoft.angularjs.Controller
import com.greencatsoft.angularjs.core.Scope

import scala.scalajs.js.annotation.{JSExportAll, JSExport}

/**
 * Created by chandrasekharkode on 10/26/14.
 */
@JSExport
object ReviewController extends Controller {

  override val name = "reviewCtrl"


  override def initialize(scope: ScopeType) = {
    scope.review = null
  }

  @JSExport
  def addReview(product: Product) = {
    println("got product : " + product)
    println("current review : " + scope.review)
    product.reviews = product.reviews :+ scope.review
    scope.review = null
  }

  trait ScopeType extends Scope {

   var review : Review

  }

}


