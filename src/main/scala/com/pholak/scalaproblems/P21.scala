package com.pholak.scalaproblems

class P21() {

  def insertAt(symbol: Symbol, i: Int, symbols: List[Symbol]) : List[Symbol] = {
    symbols.take(i) ::: List(symbol) ::: symbols.drop(i)
  }

}
