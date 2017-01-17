//Program to implement Ordered Trait by comparing name and age.

class OrderedCompare(val name:String,val age:Int) extends Ordered[OrderedCompare]{

//class that extends Ordered trait	
def compare(that:OrderedCompare)=this.name.length-that.name.length

	}
	
object OrderedTrait extends App{

val personOne=new OrderedCompare("Shivangi", 24) 
val personTwo=new OrderedCompare("Shubhra", 25)

if(personOne.name == personTwo.name)
{
	val result1= personOne.age == personTwo.age 
	println(result1)	
}

else
{
	val result2 = personOne.name.length == personTwo.name.length
	println(result2)
}


}
