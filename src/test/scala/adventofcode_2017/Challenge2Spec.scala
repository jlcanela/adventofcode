package adventofcode_2017

import scala.io.Source
import org.scalatest._

class Challenge2Spec extends FlatSpec with Matchers {

  "The Challenge 2a" should "be successful" in {
    val C2a = new C2 {}
    val source = Source.fromResource("adventofcode_2017/Challenge2a.txt").getLines.toList

    // The first row's largest and smallest values are 9 and 1, and their difference is 8.
    Row(source.head).max shouldEqual 9
    Row(source.head).min shouldEqual 1
    Row(source.head).difference shouldEqual 8

    // The second row's largest and smallest values are 7 and 3, and their difference is 4.
    Row(source(1)).max shouldEqual 7
    Row(source(1)).min shouldEqual 3
    Row(source(1)).difference shouldEqual 4

    // The third row's difference is 6.
    Row(source(2)).difference shouldEqual 6

    // The sum is 18
    C2a.a(source.mkString("\n")) shouldEqual 18

    // Challenge is solved
    C2a.a(C2a.source) shouldEqual 43074
  }

  "The Challenge 2b" should "be successful" in {
    val c2 = new C2 {}
    val source = Source.fromResource("adventofcode_2017/Challenge2b.txt").getLines.toList

    // In the first row, the only two numbers that evenly divide are 8 and 2; the result of this division is 4.
    Row(source.head).numbers shouldEqual (8, 2)
    Row(source.head).division shouldEqual 4

    // In the second row, the two numbers are 9 and 3; the result is 3.
    Row(source(1)).numbers shouldEqual (9, 3)
    Row(source(1)).division shouldEqual 3

    //  In the third row, the result is 2.
    Row(source(2)).division shouldEqual 2

    // In this example, the sum of the results would be 4 + 3 + 2 = 9.
    c2.b(source.mkString("\n")) shouldEqual 9

    // Challenge is solved
    c2.b(c2.source) shouldEqual 280
  }

}
