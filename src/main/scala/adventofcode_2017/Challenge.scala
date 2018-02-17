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
  }
}

