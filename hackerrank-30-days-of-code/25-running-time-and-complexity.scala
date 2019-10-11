/*
 * A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. 
 * Given a number, n, determine and print whether it's "Prime" or "Not prime". 
 */
 
import util.control.Breaks._

object Solution{
  def isPrime(n: Long): Boolean = {
    var prime = true
    var i = 3
    breakable(
      while (i <= Math.sqrt(n)){
        if (n % i == 0) {
          prime = false
          break
        }
        i += 2
      }
    )
    if ((n % 2 != 0 && prime && n > 2) || n == 2) return true
    false
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    val n = stdin.readInt()
    val data = new Array[Int](n)
    for (i <- 0 to n - 1) {
      data(i) = stdin.readInt()
      if (isPrime(data(i))) println("Prime")
      else println("Not prime")
    }
  }
}