/*
 * Given set S = {1, 2, 3, ..., N}. Find two integers, A and B (where A<B), from set S such that the value of A&B
 * is the maximum possible and also less than a given integer, K. In this case, & represents the bitwise AND operator.
 */
 
object Solution{
  def findMaximum(n: Int, k: Int): Int = {
    var max = 0
    var a = n - 1
    while (a - 1 > 0) {
      for (b <- a + 1 to n) {
        val test = a & b
        if (test < k && test > max) max = test
      }
      a -= 1
    }
    max
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    val t = stdin.readInt()
    for(i <- 0 to t - 1){
      val input = stdin.readLine().split(" ").map(_.trim.toInt)
      println(findMaximum(input(0), input(1)))
    }
  }
}