package adventofcode_2017

import scala.io.Source
import org.scalatest._

class Challenge1Spec extends FlatSpec with Matchers {
  "The Challenge 1a" should "be successful" in {
    val C1a = new C1 {}

    // 1122 produces a sum of 3 (1 + 2) because the first digit (1) matches the second digit and the third digit (2) matches the fourth digit.
    C1a.a("1122") shouldEqual 3

    // 1111 produces 4 because each digit (all 1) matches the next.
    C1a.a("1111") shouldEqual 4

    // 1234 produces 0 because no digit matches the next.
    C1a.a("1234") shouldEqual 0

    // 91212129 produces 9 because the only digit that matches the next one is the last digit, 9.
    C1a.a("91212129") shouldEqual 9

    // challenge is solved
    C1a.a(Source.fromResource("adventofcode_2017/Challenge1.txt").mkString) shouldEqual 993
  }

  "The Challenge 1b" should "be successful" in {
    val C1b = new C1 {}

    // 1212 produces 6: the list contains 4 items, and all four digits match the digit 2 items ahead.
    C1b.b("1212") shouldEqual 6

    // 1221 produces 0, because every comparison is between a 1 and a 2.
    C1b.b("1221") shouldEqual 0

    // 123425 produces 4, because both 2s match each other, but no other digit has a match.
    C1b.b("123425") shouldEqual 4

    // 123123 produces 12.
    C1b.b("123123") shouldEqual 12

    // 12131415 produces 4.
    C1b.b("12131415") shouldEqual 4

    // challenge is solved
    C1b.b(Source.fromResource("adventofcode_2017/Challenge1.txt").mkString) shouldEqual 1062
  }

}
