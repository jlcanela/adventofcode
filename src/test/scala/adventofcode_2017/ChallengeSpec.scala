package adventofcode_2017

import org.scalatest._

class ChallengeSpec extends FlatSpec with Matchers {
  "The Challenge 1a" should "be successful" in {
    val C1a = new C1 {}
    C1a.challenge1a("1122") shouldEqual 3
    C1a.challenge1a("1111") shouldEqual 4
    C1a.challenge1a("1234") shouldEqual 0
    C1a.challenge1a("91212129") shouldEqual 9
  }

  "The Challenge 1b" should "be successful" in {
    val C1b = new C1 {}
    C1b.challenge1b("1212") shouldEqual 6
    C1b.challenge1b("1221") shouldEqual 0
    C1b.challenge1b("123425") shouldEqual 4
    C1b.challenge1b("123123") shouldEqual 12
    C1b.challenge1b("12131415") shouldEqual 4
  }

  "The Challenge 2a" should "be successful" in {
    val C2a = new C2 {}
    val v = """5 1 9 5
    7 5 3
    2 4 6 8"""

    C2a.challenge2a(v) shouldEqual -1
  }
}
