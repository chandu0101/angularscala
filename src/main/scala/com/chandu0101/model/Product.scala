package com.chandu0101.model

import scala.scalajs.js.annotation.JSExportAll

import scala.scalajs.js

/**
 * Created by chandrasekharkode on 10/26/14.
 */
@JSExportAll
case class Product( name: String,  price: Double,  description: String, canPurchase: Boolean = true, images: Array[String],var reviews: Array[Review])

@JSExportAll
case class Review(var stars: Int, var body: String, var author: String)

@JSExportAll
case class Review2(var stars: Int, var body: String, var author: String)

@JSExportAll
case class StarOption(name :String,value:Int)