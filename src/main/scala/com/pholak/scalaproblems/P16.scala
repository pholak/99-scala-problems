package com.pholak.scalaproblems

class P16() {
  def drop(n: Int, list: List[Symbol]): List[Symbol] = {
    list.zipWithIndex.filter(x => (x._2 + 1) % n != 0).unzip._1
  }
}
