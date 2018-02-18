package adventofcode_2017

import scala.io.Source

trait C4 {

  def isValid(s: String) = {
    val array = s.split(" ")
    array.toSet.size == array.size
  }

  def isValidB(s: String) = {
    val array = s.split(" ").map(_.toArray.sorted.mkString)
    array.toSet.size == array.size
  }

  def a(s: String) : Int = s.split("\n").filter(isValid).size
  def b(s: String) : Int = s.split("\n").filter(isValidB).size

  val source : String = Source.fromResource("adventofcode_2017/Challenge4.txt").mkString
}
