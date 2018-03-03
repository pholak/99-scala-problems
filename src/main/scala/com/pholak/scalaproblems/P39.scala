package com.pholak.scalaproblems

import com.pholak.scalaproblems.P31.isPrime

class P39() {

  def listPrimesInRange(range: Range.Inclusive): List[Int] = range.filter(isPrime).toList

}
