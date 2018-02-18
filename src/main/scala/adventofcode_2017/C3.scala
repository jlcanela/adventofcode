package adventofcode_2017

trait C3 {

  case class Segment(number: Int, position: (Int, Int), direction: (Int, Int)) {

    val size = (this.number + (this.number % 2)) / 2

    def next: Segment = Segment(number + 1, nextPosition(this.position, direction, this.size), nextDirection(direction))

    def nextDirection(d: (Int, Int)) : (Int, Int) = d match {
      case (1, 0) => (0, 1)
      case (0, 1) => (-1, 0)
      case (-1, 0) => (0, -1)
      case (0, -1) => (1, 0)
      case _ => throw new Exception("invalid direction")
    }

    def nextPosition(start: (Int, Int), d: (Int, Int), length: Int) : (Int, Int) =
      (start._1 + d._1 * length, start._2 + d._2 * length)

    def positions = for {
      id <- 0 to (size - 1)
    } yield (position._1 + id * direction._1, position._2 + id * direction._2)

  }

  object root extends Segment(1, (0,0), (1, 0))

  def segmentGenerator(s: Segment) : Stream[Segment] = s #:: segmentGenerator(s.next)

  def positions = segmentGenerator(root) flatMap (_.positions)

  def a(i: Int) : Int = positions.drop(i - 1).map { case (a, b) => a.abs + b.abs } head

  val neighborhood = List((1, 0), (1, 1), (0, 1), (-1, 1), (-1, 0), (-1, -1), (0, -1), (1, -1))
  def compute(position: (Int, Int), values: Map[(Int, Int), Int]) = neighborhood map { (p) => (p._1 + position._1, p._2 + position._2) } flatMap values.get sum

  def computeAll(i: Int) : Int  = {

    var values = Map[(Int, Int), Int]((0, 0) -> 1)
    var value = 1

    for {
      p <- positions.drop(1).take(i-1).toList
    } {
      value = compute(p, values)
      values += p -> value
    }
    value
  }

  def b(limit: Int) : Int = {

    var value = 1
    var values = Map[(Int, Int), Int]((0, 0) -> 1)

    positions drop(1) map { p =>
      value = compute(p, values);
      values += p -> value;
      value
    } filter { _ > limit } take(1) head
  }

}
