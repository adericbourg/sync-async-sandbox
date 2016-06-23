import scala.concurrent.Future

trait Yay {
  def one()
  def two()
}

class Sync extends Yay {
  def one(): Return1 = ???
  def two(): Return2 = ???
}

class Async extends Yay {
  def one(): Future[Return1] = ???
  def two(): Future[Return2] = ???
}

case class Return1()

case class Return2()
