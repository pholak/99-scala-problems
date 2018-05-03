package com.pholak.scalaproblems

import com.pholak.scalaproblems.P20.removeAt

import scala.util.Random

class P23() {

  def randomSelect(i: Int, list: List[Symbol]): List[Symbol] = {
    randomSelectElement(i, list, scala.util.Random)
  }

  def randomSelectElement(i: Int, list: List[Symbol], random: Random.type): List[Symbol] = {
    if (i == 0) Nil
    else {
      val (restOfList, removedElement) = removeAt(random.nextInt(list.size), list)
      removedElement :: randomSelectElement(i - 1, restOfList, random)
    }
  }
}
