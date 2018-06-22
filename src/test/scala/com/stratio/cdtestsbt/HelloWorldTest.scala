package com.stratio.cdtestsbt

import org.scalatest._

class HelloWorldTest extends FlatSpec with Matchers {

  "This test" should "pass successfully" in {
    val test = "Nothing here"
    println(test)
  }

}

