

// Scala program to illustrate while loop
object ScalaWhile
{
	
	// Main method
	def main(args: Array[String]) : Unit =
	{
		var x = 1;

		// Exit when x becomes greater than 4
		while (x <= 4)
		{
			println("Value of x: " + x);

			// Increment the value of x for
			// next iteration
			x = x + 1;
		}
	}
}
