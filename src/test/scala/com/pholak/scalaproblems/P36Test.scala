package com.pholak.scalaproblems

import com.pholak.scalaproblems.Arithmetic._
import org.scalatest.{FunSuite, Matchers}

class P36Test extends FunSuite with Matchers {

  test("Should return list containing the prime factors and their multiplicity") {
    315.primeFactorMultiplicity should contain theSameElementsAs List((3,2), (5,1), (7,1))
  }
}
