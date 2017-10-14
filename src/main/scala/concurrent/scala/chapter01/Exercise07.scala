package concurrent.scala.chapter01

import scala.util.matching.Regex.Match

/**
  * Created by Iryna Kharaborkina on 10/14/17.
  *
  * Solution to the Chapter 01 Exercise 05
  * 'Learning Concurrent Programming in Scala' by Aleksandar Prokopec
  * https://www.packtpub.com/application-development/learning-concurrent-programming-scala-second-edition
  *
  * Implement a method that takes a regular expression, and returns a partial function
  * from a string to list of matches withing that string:
  *     def matcher(regex: String): PartialFunction[String, List[String] ]
  */
object Exercise07 extends App {

  val numberMatcher = matcher("[0-9]")
  val letterMatcher = matcher("[a-z]")
  println(Seq("aa", "bb", "cc").map(letterMatcher))
  println(Seq("11", "22", "33").map(numberMatcher))
  println(Seq("1a", "2b", "3c").map(numberMatcher))
  println(Seq("1a", "aa", "2b", "bb", "3c", "cc").map { numberMatcher orElse letterMatcher } )

  private def matcher(regex: String): PartialFunction[String, List[String]] = {
      case s: String if regex.r.findFirstIn(s).isDefined => regex.r.findAllMatchIn(s).map { case Match(str) => str}.toList
  }
}
