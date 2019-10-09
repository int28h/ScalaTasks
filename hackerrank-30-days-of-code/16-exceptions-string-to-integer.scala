/*
 * Read a string, S, and print its integer value; if S cannot be converted to an integer, print "Bad String".
 */
 
object Solution {
  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    val s = stdin.readLine()
    try {
      println(s.toInt)
    } catch {
      case e: Exception => println("Bad String")
    }
  }
}