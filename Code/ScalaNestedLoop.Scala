
// Scala program to illustrate nested loop
object ScalaNestedLoop {
	
// Main Method 
def main(args: Array[String]) : Unit = {
	
	var a = 5;
	var b = 0;
	
	// outer while loop
	while (a < 7) 
	{
	b = 0;
		
	// inner while loop
	while (b < 7 ) 
	{
			
		// printing the values of a and b
		println("Value of a = " +a+ " b = "+b);
		b = b + 1;
	}
		
	// new line
	println()
		
	// incrementing the value of a
	a = a + 1;
		
	// displaying the updated value of a
	println("Value of a Become: "+a);
		
	// new line
	println()
	}

}
}
