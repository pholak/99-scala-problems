package com.pholak.scalaproblems

class P10() {
  def encode(symbols: List[Symbol]): List[(Int, Symbol)] = {
    val list = new P09().pack(symbols)
    list.map(e => (e.size, e.head))
  }

}
