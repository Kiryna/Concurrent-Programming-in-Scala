package concurent.scala.chapter01


/**
  * Created by Iryna Kharaborkina on 10/14/17.
  *
  * Solution to the Chapter 01 Exercise 01
  * 'Learning Concurrent Programming in Scala' by Aleksandar Prokopec
  * https://www.packtpub.com/application-development/learning-concurrent-programming-scala-second-edition
  *
  * Implement a compose method with the following signature:
  *     def compose[A, B, C](g: B => C, f: A => B): A => C = ???
  * This method must return a function h, which is the composition of the
  * functions f and g.
  *
  */
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
