package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P08Test extends FunSuite with Matchers {

  test("Should eliminate consecutive duplicates of list elements") {
    val compressedList = new P08().compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    compressedList should contain theSameElementsAs List('a, 'b, 'c, 'a, 'd, 'e)
  }

}
