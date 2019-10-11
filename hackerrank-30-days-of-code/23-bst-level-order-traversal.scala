/*
 * A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right, 
 * top to bottom. You are given a pointer, root, pointing to the root of a binary search tree. 
 * Complete the levelOrder function provided in your editor so that it prints the level-order traversal 
 * of the binary search tree.
 */
 
class Node(var data: Int) {
  var left: Node = null
  var right: Node = null
}

import scala.collection.mutable.Queue

object Solution{

  def levelOrder(x: Node): Unit = {
    val queue = Queue[Node]()
    queue.addOne(x)
    var temp: Node = x
    while (!queue.isEmpty) {
      if (queue.isEmpty != true){
        //x = queue.dequeue()
        temp = queue.dequeue()
      }
      print(temp.data + " ")
      if (temp.left != null) queue.addOne(temp.left)
      if (temp.right != null) queue.addOne(temp.right)
    }
  }

  def insert(root: Node, data: Int): Node = if (root == null) new Node(data)
  else {
    var cur: Node = null
    if (data <= root.data) {
      cur = insert(root.left, data)
      root.left = cur
    }
    else {
      cur = insert(root.right, data)
      root.right = cur
    }
    root
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    val T = stdin.readInt()
    var root: Node = null
    for(i <- 0 to T - 1){
      val data = stdin.readInt()
      root = insert(root, data)
    }
    levelOrder(root)
  }

}