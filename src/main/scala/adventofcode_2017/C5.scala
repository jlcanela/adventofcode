package adventofcode_2017

import scala.annotation.tailrec
import scala.io.Source

trait C5 {

  def step(index: Int, arr: Array[Int], special: Boolean = false) : Int = {
    val newIndex = index + arr(index)
    val newValue = if (special && arr(index) >= 3) { arr(index) - 1} else { arr(index) + 1}
    arr.update(index, newValue)
    newIndex
  }

  @tailrec
  final def compute(index: Int, steps: Int, arr: Array[Int], special: Boolean) : Int = {
    if (index >= 0 && index < arr.size) {
      val newIndex : Int = step(index, arr, special)
      compute(newIndex, steps + 1, arr, special)
    } else {
      steps
    }
  }

  def a(arr: Array[Int]) = compute(0, 0, arr, false)

  def b(arr: Array[Int]) = compute(0, 0, arr, true)

  val source : Array[Int] = Source.fromResource("adventofcode_2017/Challenge5.txt").getLines().map( Integer.parseInt ).toArray
}
