package concurrent.scala.chapter01

object Exercise05 extends App {

  println(permutations("hi").mkString(" "))
  println(permutations("wow").mkString(" "))
  println(permutations("hello").mkString("\n"))

  private def permutations(x: String): Seq[String] = x.toCharArray.permutations.map(new String(_)).toSeq
}
