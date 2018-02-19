package adventofcode_2017

import scala.io.Source
import org.scalatest._

class Challenge5Spec extends FlatSpec with Matchers {

  "The Challenge 5a" should "be successful" in {
    val c5 = new C5 {}

    c5.a(Array(0, 3, 0, 1, -3)) shouldEqual 5
    c5.a(c5.source) shouldEqual 372139
  }

  "The Challenge 5b" should "be successful" in {
    val c5 = new C5 {}

    c5.b(Array(0, 3, 0, 1, -3)) shouldEqual 10
    //c5.a(c5.source) shouldEqual 372139
  }


}
