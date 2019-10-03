/*
 * Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer 
 * denoting the maximum number of consecutive 1's in n's binary representation.
 */
 
object Solution {

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    println(Integer.toBinaryString(n).split("0").max.length)
  }
}