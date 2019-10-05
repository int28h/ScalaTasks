/*
 * You are given two classes, Person and Student, where Person is the base class and Student is the derived class. 
 * Completed code for Person and a declaration for Student are provided for you in the editor. 
 * Observe that Student inherits all the properties of Person.
 *
 * Complete the Student class by writing the following:
 *
 * A Student class constructor, which has parameters:
 * A string, firstName.
 * A string, lastName.
 * An integer, id.
 * An integer array (or vector) of test scores, scores.
 *
 * A char calculate() method that calculates a Student object's average and returns the grade character 
 * representative of their calculated average:
 * O: 90 <= a <= 100
 * E: 80 <= a < 90
 * A: 70 <= a < 80
 * P: 40 <= a < 70
 * D: 40 <= a < 55
 * T: a < 40
 */
 
class Person(val firstName: String, val lastName: String, val idNumber: Int) // Constructor
{
  // Print person data
  def printPerson(): Unit = {
    println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber)
  }
}

class Student(override val firstName: String, override val lastName: String, val id: Int, var testScores: Array[Int]) extends Person(firstName, lastName, id) {

  def calculate: Char = {
    var result = 0
    for (i<- 0 to testScores.length - 1){
      result += testScores(i)
    }
    result /= testScores.length

    if  (result >= 90) return 'O'
    else if (result >= 80) return 'E'
    else if (result >= 70) return 'A'
    else if (result >= 55) return 'P'
    else if (result >= 40) return 'D'
    else return 'T'
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    var sc = new Scanner(System.in);
    val firstName = sc.next()
    val lastName = sc.next()
    val id = sc.nextInt()
    val numScores = sc.nextInt()

    val testScores = new Array[Int](numScores)
    for (i <- 0 to numScores - 1){
      testScores(i) = sc.nextInt()
    }
    sc.close()

    val s = new Student(firstName, lastName, id, testScores)
    s.printPerson()
    println("Grade: " + s.calculate)
  }
}