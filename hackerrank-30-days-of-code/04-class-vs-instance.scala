/*
 * Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge,
 * as a parameter. The constructor must assign initialAge to age after confirming the argument passed as initialAge
 * is not negative; if a negative argument is passed as initialAge the constructor should set age to 0 and print 
 * "Age is not valid, setting age to 0.". In addition, you must write the following instance methods:
 * 1. yearPasses() should increase the age instance variable by 1. 
 * 2. amIOld() should perform the following conditional actions: 
 * - If age < 13, print "You are young.". 
 * - If age > 13 and age < 18, print "You are a teenager.".
 * - Otherwise, print "You are old.". 
 */

class Person {

    var age: Int = 0

    def this(initialAge:Int) = {
        // Add some more code to run some checks on initialAge
        this()
        if(initialAge >= 0){
			age = initialAge
		} else {
			println("Age is not valid, setting age to 0.")
			age = 0
		}
    }        

    def amIOld(): Unit = {
       if (age < 13) {
            println("You are young.")
        } else if (age < 18) {
            println("You are a teenager.")
        } else {
            println("You are old.")
        }  
    }

    def yearPasses(): Unit = {
        age += 1
    }  

}

object Solution {

    def main(args: Array[String]) {
        var T = scala.io.StdIn.readInt()
        var i = 0
        for(i <- 1 to T){        
             var age=scala.io.StdIn.readInt()
             var p=new Person(age)
             p.amIOld()
             var j=0
             for(j <- 1 to 3){
                 p.yearPasses()
             }
             p.amIOld()
             System.out.println()
        }
    }
}