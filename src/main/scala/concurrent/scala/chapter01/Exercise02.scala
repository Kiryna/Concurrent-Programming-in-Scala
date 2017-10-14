package concurent.scala.chapter01

/**
  * Created by Iryna Kharaborkina on 10/14/17.
  *
  * Solution to the Chapter 01 Exercise 02
  * 'Learning Concurrent Programming in Scala' by Aleksandar Prokopec
  * https://www.packtpub.com/application-development/learning-concurrent-programming-scala-second-edition
  *
  * Implement a fuse method with the following signature:
  *     def fuse[A, B](a: Option[A], b: Option[B]): Option[(A, B)] = ???
  * The resulting Option object should contain a tuple of values from the
  * Option objects a and b, given that both a and b are non-empty. Use
  * for-comprehensions.
  *
  */
object Exercise02 extends App {

  println(fuse(Some(1), Some("2")))
  println(fuse(None,    Some("2")))
  println(fuse(Some(1), None))
  println(fuse(None,    None))


  private def fuse[A, B](a: Option[A], b: Option[B]): Option[(A, B)] = for { aVal <- a; bVal <- b } yield aVal -> bVal

}
