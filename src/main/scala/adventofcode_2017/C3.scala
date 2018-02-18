package adventofcode_2017

trait C3 {

  def nextDirection(d: (Int, Int)) : (Int, Int) = d match {
    case (1, 0) => (0, 1)
    case (0, 1) => (-1, 0)
    case (-1, 0) => (0, -1)
    case (0, -1) => (1, 0)
  }

  def nextPosition(start: (Int, Int), d: (Int, Int), length: Int) : (Int, Int) =
    (start._1 + d._1 * length, start._2 + d._2 * length)

  case class Segment(number: Int, position: (Int, Int), direction: (Int, Int)) {
    def next: Segment = Segment(number + 1, nextPosition(this.position, direction, this.size), nextDirection(direction))
    val size = (this.number + (this.number % 2)) / 2
    def positions = for {
      id <- 0 to (size - 1)
    } yield (position._1 + id * direction._1, position._2 + id * direction._2)
  }

  object root extends Segment(1, (0,0), (1, 0))

  def segmentGenerator(s: Segment) : Stream[Segment] = s #:: segmentGenerator(s.next)

  def positions = segmentGenerator(root) flatMap (_.positions)

  def a(i: Int) : Int = positions.drop(i - 1).map { case (a, b) => a.abs + b.abs } head

  def b(i: Int) : Int = 0

}
