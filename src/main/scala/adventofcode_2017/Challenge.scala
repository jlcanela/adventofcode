package adventofcode_2017

object Challenge {

  def main(args: Array[String]): Unit = {
    val c1 = new C1 {}
    println("challenge1a:")
    println(c1.a(c1.source))
    println("challenge1b:")
    println(c1.b(c1.source))

    val c2 = new C2 {}
    println("challenge2a:")
    println(c2.a(c2.source))
    println("challenge2b:")
    println(c2.b(c2.source))

    val c3 = new C3 {}
    println("challenge3a:")
    println(c3.a(312051))
    println("challenge3b:")
    println(c3.b(312051))

    val c4 = new C4 {}
    println("challenge4a:")
    println(c4.a(c4.source))
    println("challenge4b:")
    println(c4.b(c4.source))
  }
}

