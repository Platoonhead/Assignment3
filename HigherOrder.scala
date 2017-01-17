/*program to implement higher order functions, implement:
sum of squares
sum of cubes
sum of Ints */

class Calculate{

	def sum(a: Int, b: Int, f:(Int,Int) => Int): Int = f(a,b) // higher order function
}

object HigherOrder extends App{

	  val obj = new Calculate()
          val action = "squares" 
	  action match { // calling according to match
		case "squares" => val SumOfSquares = obj.sum(5, 7,(x, y)=> x*x+y*y)
                                    println(s"sum of square is $SumOfSquares") 
	
		case "cubes" => val SumOfCubes = obj.sum(5, 7,(x, y)=> x*x*x + y*y*y)
                                    println(s"sum of cubes is $SumOfCubes") 

		case "Ints" => val SumOfInts = obj.sum(5, 7,(x, y)=> x + y)
                                    println(s"sum of square is $SumOfInts") 

		case _ => println("Not a valid action")
		}




}
