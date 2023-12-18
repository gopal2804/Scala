// A simple Scala program to illustrate 
// the concept of singleton object

class AreaOfRectangle
{
	
	// Variables
	var length = 20;
	var height = 40;
	
	// Method which gives the area of the rectangle
	def area() : Unit =
	{
		var ar = length * height;
		println("Height of the rectangle is:" + height);
		println("Length of the rectangle is:" + length);
		println("Area of the rectangle is :" + ar);
	}
}

// singleton object
object ScalaSingletonObject
{
	def main(args: Array[String]) : Unit =
	{
		
		// Creating object of AreaOfRectangle class
		var obj = new AreaOfRectangle();
		obj.area();
	}
}
