import scala.concurrent.Future

class Sync {
  def one: Return1 = ???
  def two: Return2 = ???
}

class Async {
  def one: Future[Return1] = ???
  def two: Future[Return2] = ???
}

case class Return1()
case class Return2()
