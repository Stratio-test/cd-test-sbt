package com.stratio.cdtestsbt

import org.scalatest._

class HelloWorldIT extends FlatSpec with Matchers{

    "This integration test" should "pass successfully" in {
      val test = "Nothing here"
      println(test)
    }
}
