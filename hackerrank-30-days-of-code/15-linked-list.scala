/*
 * Complete the insert function in your editor so that it creates a new Node (pass data as the Node constructor argument) 
 * and inserts it at the tail of the linked list referenced by the head parameter. 
 * Once the new node is added, return the reference to the head node. 
 */
 
class Node(val data: Int) {
  next = null
  var next: Node = null
}

object Solution {
  def insert(head: Node, data: Int): Node = {
    var current: Node = head
    if (head == null) {
      var temp: Node = new Node(data)
      return temp
    }
    while ( {
      current.next != null
    }) current = current.next
    current.next = new Node(data)
    head
  }

  def display(head: Node): Unit = {
    var start = head
    while ( {
      start != null
    }) {
      print(start.data + " ")
      start = start.next
    }
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    var head: Node = null
    var N = stdin.readInt()
    while (N > 0) {
      val ele = stdin.readInt()
      head = insert(head, ele)
      N -= 1
    }
    display(head)
  }
}