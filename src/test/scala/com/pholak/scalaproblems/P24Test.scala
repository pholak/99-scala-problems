package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P24Test extends FunSuite with Matchers {

  test("Should return N random numbers from range") {
    val upperLimit = 49
    val n = 6
    val result = P24().lotto(n, upperLimit)
    val lottoRange = List.range(0, upperLimit + 1)
    assert(result.size == n)
    assert(result.forall(x => lottoRange.contains(x)))
    assert(result.distinct.forall(x => result.contains(x)))
  }

}
