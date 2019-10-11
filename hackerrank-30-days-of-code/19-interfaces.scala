/*
 * The AdvancedArithmetic interface and the method declaration for the abstract int divisorSum(int n) method 
 * are provided for you in the editor below. Write the Calculator class, which implements the AdvancedArithmetic interface. 
 * The implementation for the divisorSum method must be public and take an integer parameter, n, and return 
 * the sum of all its divisors.
 */
 
trait AdvancedArithmetic {
  def divisorSum(n: Int): Int
}

import java.util

class Calculator extends AdvancedArithmetic {
  override def divisorSum(n: Int): Int = {
    val divisors = new util.LinkedList[Integer]
    var i: Int = n
    while(i > 0){
      if (math.abs(n % i) == 0) divisors.add(i)
      i -= 1
    }
    var result = 0
    divisors.forEach(d => result += d)
    result
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    val n = stdin.readInt()
    val calculator = new Calculator
    val sum = calculator.divisorSum(n)
    println("I implemented: " + calculator.getClass().getInterfaces()(0).getName())
    println(sum)
  }
}