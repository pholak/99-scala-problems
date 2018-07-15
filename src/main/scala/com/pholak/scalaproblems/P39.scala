package com.pholak.scalaproblems

import com.pholak.scalaproblems.Arithmetic._

class P39() {

  def listPrimesInRange(range: Range.Inclusive): List[Int] = range.filter(_.isPrime).toList

}
