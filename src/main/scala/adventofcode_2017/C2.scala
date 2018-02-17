package adventofcode_2017

import scala.io.Source
import scala.util.{Try, Success}

case class Row(values: List[Int]) {
  def difference() : Int = values.max - values.min
  def max : Int = values.max
  def min : Int = values.min
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
  def check : List[Int] = rows.map(_.values.length)
}

object Spreadsheet {
  def apply(s: String) : Spreadsheet = {
    val rows = s.split("\n").toList.map((s: String) => Row(s))
    Spreadsheet(rows)
  }
}

trait C2 {

  def a(s: String) : Int = Spreadsheet(s).sum
  def b(s: String) : Int = 0

  val source : String = Source.fromResource("adventofcode_2017/Challenge2.txt").mkString

}
