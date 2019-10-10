/*
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backwards and forwards. 
 * Can you determine if a given string, s, is a palindrome?
 */
 
class MyStack {
  private val array = new Array[Character](100000)
  private var top: Int = 0

  def length: Int = {
    this.top
  }

  private def isEmpty: Boolean = {
    if (top == 0)  return true
    false
  }

  @throws[Exception]
  def add(c: Character): Unit = {
    if (top == this.array.length) throw new Exception("Overflow")
    else {
      top += 1
      this.array(top) = c
    }
  }

  @throws[Exception]
  def remove(): Character = {
    if (isEmpty) throw new Exception("Underflow")
    else {
      top -= 1
      this.array(top + 1)
    }
  }
}


class MyQueue {
  private val array = new Array[Character](1000000)
  private var head = 1
  private var tail = 1

  def add(c: Character): Unit = {
    this.array(tail) = c
    if (tail == array.length) tail = 1
    else tail += 1
  }

  def remove: Character = {
    if (head == array.length) head = 1
    else head += 1
    this.array(head - 1)
  }
}


import util.control.Breaks._

object Solution {
  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    val string = stdin.readLine()
    val s = string.toCharArray

    val queue = new MyQueue
    val stack = new MyStack

    for (c <- s) {
      stack.add(c)
      queue.add(c)
    }

    var isPalindrome = true
    breakable {
      for (i <- 1 to stack.length) {
        if (!queue.remove.equals(stack.remove())) {
          isPalindrome = false
          break
        }
      }
    }
    println("The word, " + string + ", is " + (
      if (!isPalindrome) "not a palindrome." else "a palindrome.")
    )
  }
}
