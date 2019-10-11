/*
 * Write a single generic function named printArray; this function must take an array of generic elements 
 * as a parameter (the exception to this is C++, which takes a vector). 
 * The locked Solution class in your editor tests your function.
 */
 
class Printer {
  def printArray[T](arr: Array[T]): Unit = {
    for (entry <- arr) {
      System.out.println(entry)
    }
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    var n = stdin.readInt()
    val intArray = new Array[Integer](n)
    for(i <- 0 to n - 1){
      intArray(i) = stdin.readInt()
    }

    n = stdin.readInt()
    val stringArray = new Array[String](n)
    for(i <- 0 to n - 1){
      stringArray(i) = stdin.readLine()
    }

    val printer: Printer = new Printer()
    printer.printArray(intArray)
    printer.printArray(stringArray)
    if (printer.getClass.getDeclaredMethods.count(_.getName == "printArray") > 1) 
      println("The Printer class should only have 1 method named printArray.")
  }
}