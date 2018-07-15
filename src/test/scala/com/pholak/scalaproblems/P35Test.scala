package com.pholak.scalaproblems

import com.pholak.scalaproblems.Arithmetic._
import org.scalatest.{FunSuite, Matchers}

class P35Test extends FunSuite with Matchers {

  test("Should return prime factors in ascending order") {
    315.primeFactors() should contain theSameElementsAs List(3, 3, 5, 7)
  }
}
