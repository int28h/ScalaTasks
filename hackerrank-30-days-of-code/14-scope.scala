/*
 * Complete the Difference class by writing the following:
 * A class constructor that takes an array of integers as a parameter and saves it to the elements instance variable.
 * A computeDifference method that finds the maximum absolute difference between any 2 numbers 
 * in N and stores it in the maximumDifferece instance variable.
 */
 
class Difference(var elements: Array[Int]) {
  var maximumDifference = 0

  def computeDifference(): Unit = {
    var min = this.elements(0)
    var max = this.elements(0)
    for (i <- this.elements) {
      if (i > max) max = i
      if (i < min) min = i
    }
    this.maximumDifference = max - min
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    val n = stdin.readInt()
    var a = new Array[Int](n)
    a = stdin.readLine.split(" ").map(_.toInt).distinct
    val difference = new Difference(a)
    difference.computeDifference()
    print(difference.maximumDifference)
  }
}