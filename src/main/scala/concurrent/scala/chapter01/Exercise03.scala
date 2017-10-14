package concurrent.scala.chapter01

/**
  * Created by Iryna Kharaborkina on 10/14/17.
  *
  * Solution to the Chapter 01 Exercise 03
  * 'Learning Concurrent Programming in Scala' by Aleksandar Prokopec
  * https://www.packtpub.com/application-development/learning-concurrent-programming-scala-second-edition
  *
  * Implement a check method, which takes a set of values of the type T and
  * a function of the type T => Boolean:
  *     def check[T](xs: Seq[T])(pred: T => Boolean): Boolean = ???
  * The method must return true if and only if the pred function returns true
  * for all the values in xs without throwing an exception. Use the check
  * method as follows:
  *     check(1 until 10)(40 / _ > 0)
  */
object Exercise03 extends App{

  println(check(1 until 10)(40 / _ > 0))
  println(check(1 until 10)(_ % 2 == 0))

  private def check[T](xs: Seq[T])(pred: T => Boolean): Boolean = xs.forall(pred(_))
}
