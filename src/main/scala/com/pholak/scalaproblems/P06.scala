package com.pholak.scalaproblems

class P06() {

  def isPalindrome(list: List[Int]): Boolean = {
    list == list.reverse
  }

}
