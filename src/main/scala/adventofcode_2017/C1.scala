package adventofcode_2017

import scala.io.Source

trait C1 {

  def challenge(s: String, offset: Int) : Int = {
    val digits = s.map(_ - '0'); // char to digit
    val digitsWithFollowing = digits zip (digits.drop(offset) ++ digits.take(offset)) // pair digit with other digit at offset
    val equalDigits = digitsWithFollowing.filter({ case (a, b) => a.equals(b)}).map(_._1) // filter only equal digits
    equalDigits.sum
  }

  def a(s: String) : Int = challenge(s, 1)
  def b(s: String) : Int = challenge(s,  s.length() / 2)

  val source : String = Source.fromResource("adventofcode_2017/Challenge1.txt").mkString
}
