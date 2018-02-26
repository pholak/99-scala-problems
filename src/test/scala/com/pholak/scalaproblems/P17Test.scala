package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P17Test extends FunSuite with Matchers {

  test("Should split list by given index") {
    val lists = new P17().split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

    lists._1 should contain theSameElementsAs List('a, 'b, 'c)
    lists._2 should contain theSameElementsAs List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  }

}
