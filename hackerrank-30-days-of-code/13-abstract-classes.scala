/*
 * Given a Book class and a Solution class, write a MyBook class that does the following:
 * Inherits from Book
 *
 * Has a parameterized constructor taking these parameters:
 * - string title
 * - string author
 * - int price
 * 
 * Implements the Book class' abstract display() method so it prints these lines:
 * Title: a space, and then the current instance's title.
 * Author: a space, and then the current instance's author.
 * Price: a space, and then the current instance's price.
 */
 
abstract class Book (val title : String, val author : String) {
  def display(): Unit
}

class MyBook (override val title: String, override val author: String, val price: Int) extends Book (title, author) {
  override def display(): Unit ={
    println("Title: " + this.title)
    println("Author: " + this.author)
    println("Price: " + this.price)
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    val title: String = stdin.readLine()
    val author: String = stdin.readLine()
    val price: Int = stdin.readInt()

    val book = new MyBook(title, author, price)
    book.display()
  }
}