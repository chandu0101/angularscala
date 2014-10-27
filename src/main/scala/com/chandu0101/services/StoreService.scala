package com.chandu0101.services

import com.chandu0101.model.{Review, Product}
import com.greencatsoft.angularjs.core.HttpService
import com.greencatsoft.angularjs.{Factory, inject, injectable}

import scala.scalajs.js.JSConverters.JSRichGenTraversableOnce

/**
 * Created by chandrasekharkode on 10/26/14.
 */
@injectable("$storeService")
class StoreService(val http: HttpService) {

  def findAll(): Seq[Product] = {
    Seq(Product("Bloodstone",100,"Excellent gem",images =Array("gem1-01.gif","gem1-02.gif","gem1-03.gif"),reviews = Array(Review(3,"ok product","name1@gmail.com"),Review(2,"bad product","name2@gmail.com"))),
      Product("Zicrom",1000,"Moderate gem",images =Array("gem2-01.gif","gem2-02.gif","gem2-03.gif"),reviews = Array(Review(4,"ok product","name1@gmail.com"),Review(5,"bad product","name2@gmail.com")))
    ,Product("Aricon",502,"Moderate gem",images =Array("gem3-01.gif","gem1-02.gif"),reviews = Array(Review(5,"ok product","name1@gmail.com"),Review(2,"bad product","name2@gmail.com"))))
  }
}

object StoreServiceFactory extends Factory[StoreService] {
  override val name = "$storeService"
  @inject
  var http: HttpService = _

  override def apply(): StoreService = new StoreService(http)
}