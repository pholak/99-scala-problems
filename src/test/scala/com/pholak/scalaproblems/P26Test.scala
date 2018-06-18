package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P26Test extends FunSuite with Matchers {

  test("Should generate the combinations of 3 distinct objects chosen from the 4 elements of a list") {
    val list = P26().combinations(3, List('a, 'b, 'c, 'd))
    list should contain theSameElementsAs List(List('a, 'b, 'd), List('a, 'b, 'c), List('a, 'c, 'd), List('b, 'c, 'd))
  }

}
