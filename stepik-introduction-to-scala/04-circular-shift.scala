/*
 * Посчитайте число единиц в битовой записи числа, считанного с клавиатуры, и выведите на экран.
 */
 
import scala.io.StdIn

object Main {
	def main(args: Array[String]) {
	  val result = BigInt(scala.io.StdIn.readInt()).bitCount
	  println(result)
	}
}