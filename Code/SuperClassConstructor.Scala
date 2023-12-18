// Scala program to illustrate
// calling a super class constructor

// Primary constructor
class GFG (var message: String)
{
	println(message)
}


// Calling the super class constructor
class Subclass (message: String) extends GFG (message) 
{
	def display() : Unit =
	{
		println("Subclass constructor called")
	}
}

// Creating object
object SuperClassConstructor 
{ 
	// Main method
	def main(args: Array[String]) : Unit =
	{ 
		
		// Creating object of Subclass 
		var obj = new Subclass("Geeksforgeeks"); 
		obj.display();
	} 
} 
