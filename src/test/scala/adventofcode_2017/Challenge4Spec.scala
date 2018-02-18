package adventofcode_2017

import scala.io.Source
import org.scalatest._

class Challenge4Spec extends FlatSpec with Matchers {

  "The Challenge 4a" should "be successful" in {
    val c4 = new C4 {}

    // aa bb cc dd ee is valid.
    c4.isValid("aa bb cc dd ee") shouldEqual(true)

    // aa bb cc dd aa is not valid - the word aa appears more than once.
    c4.isValid("aa bb cc dd aa") shouldEqual(false)

    // aa bb cc dd aaa is valid - aa and aaa count as different words.
    c4.isValid("aa bb cc dd aaa is valid") shouldEqual(true)

    // Solve challenge
    c4.a(c4.source) shouldEqual 466
  }

  "The Challenge 4b" should "be successful" in {
    val c4 = new C4 {}

    // abcde fghij is a valid passphrase.
    c4.isValidB("abcde fghij") shouldEqual(true)

    // abcde xyz ecdab is not valid - the letters from the third word can be rearranged to form the first word.
    c4.isValidB("abcde xyz ecdab") shouldEqual(false)

    // a ab abc abd abf abj is a valid passphrase, because all letters need to be used when forming another word.
    c4.isValidB("a ab abc abd abf abj") shouldEqual(true)

    // iiii oiii ooii oooi oooo is valid.
    c4.isValidB("iiii oiii ooii oooi oooo") shouldEqual(true)

    // oiii ioii iioi iiio is not valid - any of these words can be rearranged to form any other word.
    c4.isValidB("oiii ioii iioi iiio") shouldEqual(false)

    // Solve challenge
    c4.b(c4.source) shouldEqual 251

  }


}
