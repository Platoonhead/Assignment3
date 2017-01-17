/*Q3. Question on Trait and packages:
Make a trait Queue which performs two functions of enqueue and dequque.
Two classes: DoubleQueue and SquareQueue mix in this trait.
You may use List for the implementation and keep both the classes in the same file with proper packaging.

DoubleQueue enqueues the element after doubling them
SquareQueue enqueues the element after squaring them
dequeue method will remove the first element from the queue(having concrete definition in trait Queue).

*/

package Com{
	package Knoldus {
	
		trait QueueEdit {
			val queuelist = List(0, 1)
			def enqueue (val element : Int): Int = {
			
                                     	
			}

			def dequeue {}		
		}

		class DoubleQueue extends Queue{
	     
                    val myelement = (x:Int):Int => 2*x
		    enqueue(myelement)
		}

		class SquaureQueue extends Queue{

                    val myelement = (x:Int):Int => x*x
		    enqueue(myelement)
		}
	}
	object Queue extends App {
		
	
	}

}
