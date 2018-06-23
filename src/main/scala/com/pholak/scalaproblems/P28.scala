package com.pholak.scalaproblems

case class P28() {
  def lsort(list: List[List[Symbol]]): List[List[Symbol]] = {
    list.sortBy(_.length)
  }

  def lsortFreq(list: List[List[Symbol]]): List[List[Symbol]] = {
    list.groupBy(_.size).toList.sortBy(_._2.size).flatMap(_._2)
  }
}