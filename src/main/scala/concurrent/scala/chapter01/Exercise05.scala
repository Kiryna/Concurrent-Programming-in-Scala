package concurrent.scala.chapter01

/**
  * Created by Iryna Kharaborkina on 10/14/17.
  *
  * Solution to the Chapter 01 Exercise 05
  * 'Learning Concurrent Programming in Scala' by Aleksandar Prokopec
  * https://www.packtpub.com/application-development/learning-concurrent-programming-scala-second-edition
  *
  * Implement a permutations function, which, given a string, returns a
  * sequence of strings that are lexicographic permutations of the input string:
  *     def permutations(x: String): Seq[String]
  */
object Exercise05 extends App {

  println(permutations("hi").mkString(" "))
  println(permutations("wow").mkString(" "))
  println(permutations("hello").mkString("\n"))

  private def permutations(x: String): Seq[String] = x.permutations.toSeq
}
