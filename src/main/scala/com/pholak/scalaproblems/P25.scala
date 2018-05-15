package com.pholak.scalaproblems

case class P25() {
  def randomPermute[A](list: List[A]): List[A] = {
    P23().randomSelect(list.size, list)
  }
}
