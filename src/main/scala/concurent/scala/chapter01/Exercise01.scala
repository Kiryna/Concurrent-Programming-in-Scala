package concurent.scala.chapter01

object Exercise01 extends App {

  val double = (x: Int) => x * 2

  val half = (x: Int) => x / 2.0

  val makeString = (x: AnyVal) => s"The number is $x"

  val doubleString = compose(makeString, double)
  val halfString = compose(makeString, half)

  println(doubleString(5))
  println(doubleString(8))

  println(halfString(5))
  println(halfString(8))

  private def compose[A, B, C](g: B => C, f: A => B): A => C = (x: A) => g(f(x))
}
