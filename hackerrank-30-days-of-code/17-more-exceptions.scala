/*
 * Write a Calculator class with a single method: int power(int,int). 
 * The power method takes two integers, n and p, as parameters and returns the integer result of n^p. 
 * If either n or p is negative, then the method must throw an exception with the message: 
 * "n and p should be non-negative".
 */
 
class Calculator {
  @throws[Exception]
  def power(a: Int, b: Int): Int = {
    if (a < 0 || b < 0) throw new Exception("n and p should be non-negative")
    Math.pow(a, b).toInt
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    var t = stdin.readInt()
    while (t > 0) {
      val myCalculator = new Calculator
      try {
        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        println(myCalculator.power(arr(0), arr(1)))
      } catch {
        case e: Exception =>
          println(e.getMessage)
      }
      t -= 1
    }
  }
}