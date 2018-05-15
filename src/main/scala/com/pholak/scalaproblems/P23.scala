package com.pholak.scalaproblems

import com.pholak.scalaproblems.P20.removeAt

import scala.util.Random

case class P23() {

  def randomSelect[A](i: Int, list: List[A]): List[A] = {
    randomSelectElement(i, list, scala.util.Random)
  }

  private def randomSelectElement[A](i: Int, list: List[A], random: Random.type): List[A] = {
    if (i == 0) Nil
    else {
      val (restOfList, removedElement) = removeAt(random.nextInt(list.size), list)
      removedElement :: randomSelectElement(i - 1, restOfList, random)
    }
  }
}
