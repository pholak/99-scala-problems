import org.scalatest.FunSuite

class P06Test extends FunSuite {

  test("P06.isPalindrome(1,2,3,2,1) should return true") {
    val isPalindrome = new P06().isPalindrome(List(1, 2, 3, 2, 1))
    assert(isPalindrome)
  }

  test("P06.isPalindrome(2,2,3,2,1) shouldn return false") {
    val isPalindrome =  new P06().isPalindrome(List(2, 2, 3, 2, 1))
    assert(!isPalindrome)
  }

}
