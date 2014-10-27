package com.chandu0101.routers

import com.greencatsoft.angularjs.{inject, Config}
import com.greencatsoft.angularjs.core.{Route, RouteProvider}

/**
 * Created by chandrasekharkode on 10/26/14.
 */
object StoreRouter extends Config{

  @inject
  var routeProvider: RouteProvider = _

  override  def initialize() {
    routeProvider
      .when("/", Route("index.html","Home"))
      .when("/hello",Route("hello.html","Hello"))
  }

}
