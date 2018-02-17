package adventofcode_2017

import scala.io.Source
import org.scalatest._

class Challenge2Spec extends FlatSpec with Matchers {

  "The Challenge 2a" should "be successful" in {
    val C2a = new C2 {}
    val source = Source.fromResource("adventofcode_2017/Challenge2a.txt").getLines.toList

    Row(source.head).max shouldEqual 9
    Row(source.head).min shouldEqual 1
    Row(source.head).difference shouldEqual 8

    Row(source(1)).max shouldEqual 7
    Row(source(1)).min shouldEqual 3
    Row(source(1)).difference shouldEqual 4

    Row(source(2)).difference shouldEqual 6

    C2a.a(source.mkString("\n")) shouldEqual 18

    C2a.a(C2a.source) shouldEqual 43074
  }
}
