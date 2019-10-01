/*
 * Given an integer, n, perform the following conditional actions:
 * If n is odd, print "Weird"
 * If n is even and in the inclusive range of 2 to 5, print "Not Weird"
 * If n is even and in the inclusive range of 6 to 20, print "Weird"
 * If n is even and greater than 20, print "Not Weird"
 * Complete the stub code provided in your editor to print whether or not n is weird.
 */

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {
    def checks( n:Int ): String = {
        if (n % 2 == 1 || (n >= 6 && n <= 20 && n % 2 == 0)){
            return("Weird")
        }
        else if (n % 2 == 0 && (n >= 2 && n <= 5) || (n % 2 == 0)){
            return("Not Weird")
        } else {
            return("Error")
        }
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val N = stdin.readLine.trim.toInt
        println(checks(N))
    }
}