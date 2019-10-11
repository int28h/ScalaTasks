/*
 * A Node class is provided for you in the editor. A Node object has an integer data field, data, 
 * and a Node instance pointer, next, pointing to another node (i.e.: the next node in a list).
 *
 * A removeDuplicates function is declared in your editor, which takes a pointer to the head node 
 * of a linked list as a parameter. Complete removeDuplicates so that it deletes any duplicate nodes 
 * from the list and returns the head of the updated list.
 *
 * Note: The head pointer may be null, indicating that the list is empty. 
 * Be sure to reset your pointer when performing deletions to avoid breaking the list.
 */
 
class Node(var data: Int) {
  next = null
  var next: Node = null
}

object Solution{
  def removeDuplicates(head: Node): Node = {
    var current: Node = head
    while (current.next != null) {
      if (current.data != current.next.data) current = current.next
      else {
        val temp = current.next.next
        current.next = temp
      }
    }
    head
  }

  def insert(head: Node, data: Int): Node = {
    var temp: Node = head
    val p = new Node(data)
    if (temp == null) temp = p
    else if (temp.next == null) temp.next = p
    else {
      var start = temp
      while ( {
        start.next != null
      }) start = start.next
      start.next = p
    }
    temp
  }

  def display(head: Node): Unit = {
    var start = head
    while ( {
      start != null
    }) {
      System.out.print(start.data + " ")
      start = start.next
    }
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    var head: Node = null
    var T = stdin.readInt()
    for(i <- 0 to T - 1){
      val ele = stdin.readInt()
      head = insert(head, ele)
    }
    head = removeDuplicates(head)
    display(head)
  }
}