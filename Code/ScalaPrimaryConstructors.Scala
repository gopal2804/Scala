
// Scala program to illustrate the 
// concept of primary constructor 

// Creating a primary constructor
// with parameter-list
class GFG(Aname: String, Cname: String, Particle: Int)
{
	def display() : Unit = 
	{
		println("Author name: " + Aname);
		println("Chapter name: " + Cname);
		println("Total published articles:" + Particle);
	}
}

object ScalaPrimaryConstructors 
{
	def main(args: Array[String]) : Unit =
	{
		
		// Creating and initializing
		// object of GFG class
		var obj = new GFG("Ankita", "Constructors", 145);
		obj.display();
	}
}
