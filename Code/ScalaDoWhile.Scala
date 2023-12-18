

// Scala program to illustrate do..while loop
object ScalaDoWhile
{
	
	// Main method
	def main(args: Array[String]) : Unit =
	{
		var a = 10;

		// using do..while loop
		do
		{
			print(a + " ");
			a = a - 1;
		}while(a > 0);
	}
}
