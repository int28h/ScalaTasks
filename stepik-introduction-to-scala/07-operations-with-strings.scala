/*
 * Cчитайте из консоли два числа: startIndex и endIndex. Считайте строку str.
 *
 * Напечатайте в ответ входную строку, обратив порядок символов от startIndex до endIndex ﻿включительно.
 * 
 * Sample Input:
 * 2 6
 * foobarbaz
 * 
 * Sample Output:
 * fobraboaz
 */

object Solution {
  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val indexes: Array[Int] = stdin.readLine.split(" ").map(_.trim.toInt)
    val string = stdin.readLine()

    println(string.slice(0, indexes(0)) + string.slice(indexes(0), indexes(1) + 1).reverse + string.slice(indexes(1) + 1, string.length))
  }
}

/*
 * Ваша задача - определить, является ли переданная строка input записанной в snake-case стиле.
 *
 * Требования snake-case к строке:
 * 1. Должна содержать только строчные латинские буквы и символ подчёркивания
 * 2. Символ подчёркивания не должен стоять в начале и в конце строки
 * 3. Два символа подчёркивания не могут стоять рядом
 * 
 * Считайте из стандартного потока ввода строку и напечатайте true, если она удовлетворяет требованиям выше, false ﻿иначе.
 * Подсказка: возможно, вам пригодятся регулярные выражения.
 * 
 * Sample Input:
 * snake_case
 * 
 * Sample Output:
 * true
 */

object Main {
  def main(args: Array[String]) {
    val reg = "[a-z]+(_[a-z]+)*"
    val str = readLine()
    println(str.matches(reg)) 
  }
}