/*
 * Given an integer, n, print its first 10 multiples. 
 * Each multiple n * i (where 1<= i <= 10) should be printed on a new line in the form: n x i = result.
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

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt
        var i = 0
        for(i <- 1 to 10){
            println(n + " x " + i + " = " + n*i);
        }
    }
}
