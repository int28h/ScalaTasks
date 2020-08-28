/*
Считайте с клавиатуры число n и выведите на экран все упорядоченные пары взаимно простых чисел от 1 до n,
не включая n, ﻿в лексикографическом порядке.
*/
object Main {
  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val n = stdin.readInt()

    for (i <- 1 until n; j <- 1 until n) {
      if (BigInt(i).gcd(BigInt(j)) == 1) {
        println(s"$i $j")
      }
    }
  }
}
