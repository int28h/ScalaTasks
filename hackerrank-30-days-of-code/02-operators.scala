/*
 * Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip),
 * and tax percent (the percentage of the meal price being added as tax) for a meal, 
 * find and print the meal's total cost. 
 *
 * Input Format
 * There are 3 lines of numeric input:
 * The first line has a double, mealCost (the cost of the meal before tax and tip).
 * The second line has an integer, tipPercent (the percentage of mealCost being added as tip).
 * The third line has an integer, taxPercent (the percentage of mealCost being added as tax).
 *
 * Output Format
 * Print "The total meal cost is totalCost dollars.", where totalCost is the rounded integer 
 * result of the entire bill (mealCost with added tax and tip).
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

    // Complete the solve function below.
    def solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) {
        val tip = meal_cost * (tip_percent.toDouble / 100)
        val tax = meal_cost * (tax_percent.toDouble / 100)
        val result = math.round(meal_cost + tip + tax).toInt

        println(result)
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val meal_cost = stdin.readLine.trim.toDouble

        val tip_percent = stdin.readLine.trim.toInt

        val tax_percent = stdin.readLine.trim.toInt

        solve(meal_cost, tip_percent, tax_percent)
    }
}