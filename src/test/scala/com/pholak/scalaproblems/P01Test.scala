package com.pholak.scalaproblems

import org.scalatest.{FlatSpec, Matchers}

class P01Test extends FlatSpec with Matchers {

  "P01.last method" should "return last element" in {
    val last = new P01().last(List(1, 1, 2, 3, 5, 8))
    assert(last == 8)
  }

}
