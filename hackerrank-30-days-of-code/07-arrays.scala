/*
 * Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers. 
 */
 
object Solution {

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val arr:Array[Int] = stdin.readLine.split(" ").map(_.trim.toInt).reverse

    println(arr.mkString(" "))
  }
}