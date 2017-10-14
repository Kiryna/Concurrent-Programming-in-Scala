package concurrent.scala.chapter01

/**
  * Created by Iryna Kharaborkina on 10/14/17.
  *
  * Solution to the Chapter 01 Exercise 05
  * 'Learning Concurrent Programming in Scala' by Aleksandar Prokopec
  * https://www.packtpub.com/application-development/learning-concurrent-programming-scala-second-edition
  *
  * Implement a combinations function that, given a sequence of elements,
  * produce an iterator over all possible combinations of length n.
  * A combination is a way of selecting elements from the collection
  * so that every element is selected once, and the order of elements
  * does not matter. For example, given a collection Seq(1, 4, 9, 16),
  * combination of length 2 are Seq(1, 4), Seq(1, 9), Seq(1, 16),
  * Seq(4, 9), Seq(4, 16), and Seq(9, 16). The combination function
  * has the following signature:
  *     def combinations(n: Int, xs: Seq[Int]): Iterator[ Seq[Int] ]
  * The Iterator API in the standard library documentation
  */
object Exercise06 extends App {

  println(combinations(2, Seq(1, 4, 9, 16)).mkString(", "))
  println(combinations(2, Seq(1, 1, 2)).mkString(", "))

  private def combinations(n: Int, xs: Seq[Int]): Iterator[Seq[Int]] = xs.combinations(n)

}
