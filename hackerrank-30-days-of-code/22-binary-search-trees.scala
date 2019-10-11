/*
 * The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. 
 * You are given a pointer, root, pointing to the root of a binary search tree. 
 * Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.
 */
 
class Node(var data: Int) {
  var left: Node = null
  var right: Node = null
}

object Solution{
  def getHeight(root: Node): Int = {
    if (root == null) return -1
    1 + Math.max(getHeight(root.left), getHeight(root.right))
  }

  def insert(root: Node, data: Int): Node = {
    if (root == null) new Node(data)
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
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    var T = stdin.readInt()
    var root: Node = null
    for(i <- 0 to T - 1){
      val data = stdin.readInt()
      root = insert(root, data)
    }
    val height = getHeight(root)
    println(height)
  }
}