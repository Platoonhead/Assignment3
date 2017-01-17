//Program on Trait and packages:

package com {
	package knoldus{

		trait QueueEdit { // trait with one concrete method and one abstract method
			
			def enqueue (element : Int, series : List[Int] ) : List[Int]   // abstract method
			 
			

			def dequeue(series : List[Int]){                              // concrete method to delete first element from queue
			  
			  println(series.tail)
			}		
		}

		class DoubleQueue extends QueueEdit{                       // class to add double of element to the queue
		  override def enqueue (element : Int, series : List[Int] ) : List[Int]= {

	     	  val doubleit = element*2
		  val newseries = series :+ doubleit
		  newseries
	
		
                  }
		}

		class SquareQueue extends QueueEdit{                       // class to add square of element to the queue
	          override def enqueue (element : Int, series : List[Int] ) : List[Int]={

	     	  val squareit = element * element
		  val newseries = series :+ squareit
		  newseries
		   }
                   
		}

 
	}


               

}
	object MyQueue extends App {
		
	         val obj1 = new com.knoldus.DoubleQueue                            // Instantiating DoubleQueue class
	         val obj2 = new com.knoldus.SquareQueue				   // Instantiating SquareQueue class
                 val queueSeries : List[Int] = List(10,20,30)// Initial List

	         var result: List[Int] =  obj1.enqueue(5,queueSeries)
                 result =  obj2.enqueue(5,result)                                  // resultant list after adding element
                 println(result)
                 
		 obj1.dequeue(result)						   // resultant list after deleting element
		


		}


