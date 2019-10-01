/*
 * Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you. You must:
 * 
 * Declare 3 variables: one of type int, one of type double, and one of type String.
 * Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) 
 * and initialize your 3 variables.
 * Use the + operator to perform the following operations:
 * Print the sum of i plus your int variable on a new line.
 * Print the sum of d plus your double variable to a scale of one decimal place on a new line.
 * Concatenate s with the string you read as input and print the result on a new line. 
 */

object Solution {
    def main(args: Array[String]) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "

		// Read values of another integer, double, and string variables
        // Note use scala.io.StdIn to read from stdin
        val int = scala.io.StdIn.readInt()
        val double = scala.io.StdIn.readDouble()
        val string = scala.io.StdIn.readLine()
        // Print the sum of both the integer variables
        println(addInt(i,int))
        // Print the sum of both the double variables
        println(d + double)
        // Concatenate and print the string variables
        // The 's' variable above should be printed first.
        println(s + string)
    }

    def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
}
