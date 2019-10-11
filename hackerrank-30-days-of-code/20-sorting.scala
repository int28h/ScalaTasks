/*
 * Given an array, a, of size distinct elements, sort the array in ascending order using the Bubble Sort algorithm above. 
 * Once sorted, print the following 3 lines:
 * 1. Array is sorted in numSwaps swaps where numSwaps is the number of swaps that took place.
 * 2. First Element: firstElement where firstElement is the first element in the sorted array.
 * 3. Last Element: lastElement where lastElement is the last element in the sorted array.
 */
 
object Solution {
  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    val n = stdin.readInt()
    var arr: Array[Int] = stdin.readLine.split(" ").map(_.trim.toInt)

    var swaps = 0
    for(i <- 0 to n - 1){
      for(j <- 0 to n - 2){
        if (arr(j) > arr(j + 1)) {
          val t = arr(j + 1)
          arr(j + 1) = arr(j)
          arr(j) = t
          swaps += 1
        }
      }
    }
    println("Array is sorted in " + swaps + " swaps.")
    println("First Element: " + arr(0))
    println("Last Element: " + arr(n - 1))
  }
}