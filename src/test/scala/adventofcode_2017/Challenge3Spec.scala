package adventofcode_2017

import scala.io.Source
import org.scalatest._

class Challenge3Spec extends FlatSpec with Matchers {

  "The Challenge 2a" should "be successful" in {
    val c3 = new C3 {}

    // Data from square 1 is carried 0 steps, since it's at the access port.
    c3.a(1) shouldEqual 0

    // Data from square 12 is carried 3 steps, such as: down, left, left.
    c3.a(12) shouldEqual 3

    // Data from square 23 is carried only 2 steps: up twice.
    c3.a(23) shouldEqual 2

    // Data from square 1024 must be carried 31 steps.
    c3.a(1024) shouldEqual 31

    // Solve challenge
    c3.a(312051) shouldEqual 430

  }

  "The Challenge 3b" should "be successful" in {
    val c3 = new C3 {}

    // Square 1 starts with the value 1.
    c3.computeAll(1) shouldEqual(1)

    // Square 2 has only one adjacent filled square (with value 1), so it also stores 1.
    c3.computeAll(2) shouldEqual(1)

    // Square 3 has both of the above squares as neighbors and stores the sum of their values, 2.
    c3.computeAll(3) shouldEqual(2)

    // Square 4 has all three of the aforementioned squares as neighbors and stores the sum of their values, 4.
    c3.computeAll(4) shouldEqual(4)

    // Square 5 only has the first and fourth squares as neighbors, so it gets the value 5.
    c3.computeAll(5) shouldEqual(5)

    // Solve challenge
    c3.b(312051) shouldEqual(312453)
  }

}
