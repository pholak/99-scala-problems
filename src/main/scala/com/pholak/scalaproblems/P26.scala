package com.pholak.scalaproblems

case class P26() {

  def combinations[T](k: Int, list: List[T]): List[List[T]] = {
    list.combinations(k).toList
  }

}