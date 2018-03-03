package com.pholak.scalaproblems

object P31 {

  def isPrime(n: Int): Boolean = !((2 until n - 1) exists (n % _ == 0))

}
