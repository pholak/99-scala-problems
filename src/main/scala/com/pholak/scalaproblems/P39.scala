package com.pholak.scalaproblems

class P39() {

  def listPrimesInRange(range: Range.Inclusive): List[Int] = range.filter(isPrime).toList

  def isPrime(n: Int): Boolean = !((2 until n - 1) exists (n % _ == 0))

}
