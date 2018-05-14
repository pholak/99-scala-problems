package com.pholak.scalaproblems

case class P24() {
  def lotto(n: Int, upperLimit: Int): List[Int] = {
    new P23().randomSelect(n, List.range(0, upperLimit + 1))
  }

}
