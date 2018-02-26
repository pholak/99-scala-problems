package com.pholak.scalaproblems

class P17() {

  def split(n: Int, list: List[Symbol]): (List[Symbol], List[Symbol]) = {
    list.splitAt(n)
  }

}
