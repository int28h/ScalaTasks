/*
 * Consider a database table, Emails, which has the attributes First Name and Email ID. 
 * Given N rows of data simulating the Emails table, print an alphabetically-ordered list of people whose 
 * email address ends in @gmail.com.
 *
 * Print an alphabetically-ordered list of first names for every user with a gmail account. 
 * Each name must be printed on a new line.
 */
 
import java.util

object Solution{

  import java.util.Collections
  import java.util

  def main(args: Array[String]): Unit = {
    val pattern = "@gmail.com"

    val stdin = scala.io.StdIn
    val n = stdin.readInt()
    val data = new util.LinkedList[String]()

    for(i <- 0 to n - 1){
      val nameAndEmail = stdin.readLine().split(" ").toArray
      if (nameAndEmail(1).contains(pattern)) data.add(nameAndEmail(0))
    }

    Collections.sort(data)

    val iterator = Iterator(data)
    for (name <- iterator) {
      println(name)
    }
  }
}