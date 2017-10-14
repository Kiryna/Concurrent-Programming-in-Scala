package concurrent.scala.chapter01

/**
  * Created by Iryna Kharaborkina on 10/14/17.
  *
  * Solution to the Chapter 01 Exercise 03
  * 'Learning Concurrent Programming in Scala' by Aleksandar Prokopec
  * https://www.packtpub.com/application-development/learning-concurrent-programming-scala-second-edition
  *
  * Modify the Pair class from this chapter so that it can be used in a pattern match.
  */
object Exercise04 extends App {
  matchPair(Pair( 1,   5))
  matchPair(Pair("1",  5))
  matchPair(Pair( 1,  "5"))
  matchPair(Pair("1", "5"))

  private def matchPair[P, Q](p: Pair[P, Q]): Unit = p match {
    case Pair(_: Int, _: Int) => println("Both are Int")
    case Pair(_: Int, _) => println("First is Int")
    case Pair(_, _: Int) => println("Second is Int")
    case _ => println("None is Int")
  }

}

case class Pair[P, Q](val first: P, val second: Q)
