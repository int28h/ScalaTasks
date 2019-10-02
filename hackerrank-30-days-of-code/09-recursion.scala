/*
 * Write a factorial function that takes a positive integer, N as a parameter and prints the result of N!(N factorial).
 */
 
import java.io._

object Solution {

  // Complete the factorial function below.
  def factorial(n: Int): Int = {
    var result = 1
    var i = 0
    for(i<-1 to n){
      result *= i
    }

    return result
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val result = factorial(n)

    printWriter.println(result)

    printWriter.close()
  }
}
