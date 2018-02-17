package adventofcode_2017

import scala.io.Source
import org.scalatest._

class Challenge1Spec extends FlatSpec with Matchers {
  "The Challenge 1a" should "be successful" in {
    val C1a = new C1 {}
    C1a.a("1122") shouldEqual 3
    C1a.a("1111") shouldEqual 4
    C1a.a("1234") shouldEqual 0
    C1a.a("91212129") shouldEqual 9
    C1a.a(Source.fromResource("adventofcode_2017/Challenge1.txt").mkString) shouldEqual 993
  }

  "The Challenge 1b" should "be successful" in {
    val C1b = new C1 {}
    C1b.b("1212") shouldEqual 6
    C1b.b("1221") shouldEqual 0
    C1b.b("123425") shouldEqual 4
    C1b.b("123123") shouldEqual 12
    C1b.b("12131415") shouldEqual 4
    C1b.b(Source.fromResource("adventofcode_2017/Challenge1.txt").mkString) shouldEqual 1062
  }

}
