/*
 * Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters 
 * as 2 space-separated strings on a single line (see the Sample below for more detail).
 *
 * Note: 0 is considered to be an even index. 
 */
 
object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN.
    Print output to STDOUT.
    Your class should be named Solution
    */
    val stdin = scala.io.StdIn
    val T = stdin.readLine.trim.toInt

    var i = 0
    for(i<-1 to T){
      var even = ""
      var odd = ""
      val s = stdin.readLine

      var j = 0
      for (j<-1 to s.length()) {
        if(j % 2 == 0){
          even += s.charAt(j-1);
        } else {
          odd += s.charAt(j-1);
        }
      }
      println(odd + " " + even)
    }
  }
}