package adventofcode_2017

import scala.io.Source
import scala.util.{Try, Success}

case class Row(values: List[Int]) {
  def difference() : Int = values.max - values.min
  def max : Int = values.max
  def min : Int = values.min
  def numbers : (Int, Int) = (for {
      iA <- 0 to values.length - 1
      iB <- 0 to values.length - 1 if iA != iB
      a = values(iA)
      b = values(iB) if a >= b  && a % b == 0
    } yield (a, b)).head
  def division : Int = numbers match {
    case (a, b) => a / b
    case _ => 0
  }
}

object Row {
  def apply(s: String): Row = {
    val lines = s.split("\\s+").toList
    val values : List[Int] = lines map { (v) => Try(Integer.parseInt(v)) } collect { case Success(v) => v }
    Row(values)
  }
}

case class Spreadsheet(rows: List[Row]) {
  def sum : Int = rows.map(_.difference()).sum
  def sumDivision : Int = rows.map(_.division).sum
  def getRowSizes : List[Int] = rows.map(_.values.length)
}

object Spreadsheet {
  def apply(s: String) : Spreadsheet = {
    val rows = s.split("\n").toList.map((s: String) => Row(s))
    Spreadsheet(rows)
  }
}

trait C2 {

  def a(s: String) : Int = Spreadsheet(s).sum
  def b(s: String) : Int = Spreadsheet(s).sumDivision

  val source : String = Source.fromResource("adventofcode_2017/Challenge2.txt").mkString

}
