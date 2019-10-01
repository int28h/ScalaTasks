/*
 * Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
 * You will then be given an unknown number of names to query your phone book for. 
 * For each name queried, print the associated entry from your phone book on a new line in the form 
 * "name=phoneNumber"; if an entry for is not found, print "Not found" instead. 
 */
 
object Solution {

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val n = stdin.readLine().toInt

    var phoneBook:Map[String, String] = Map()

    var i = 0
    for(i<-1 to n){
      val arr = stdin.readLine().split(" ").map(_.trim)
      val name = arr(0)
      val phone = arr(1)
      phoneBook += (name -> phone)
    }

    var line = stdin.readLine()
    while(line != null){
      if(phoneBook.contains(line)){
        println(line + "=" + phoneBook(line))
      } else {
        println("Not found")
      }
      line = stdin.readLine()
    }
  }
}