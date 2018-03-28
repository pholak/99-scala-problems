package com.pholak.scalaproblems

class P12() {
  def decode(tuples: List[(Int, Symbol)]): List[Any] = {
    tuples.flatMap(e => List.fill(e._1)(e._2))
  }
}
