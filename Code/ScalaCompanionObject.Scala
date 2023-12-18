
// A Scala program to illustrate 
// the concept of the Companion object

// Companion class
class ScalaCompanionObject
{
	
	// Variables of Companion class
	var str1 = "GeeksforGeeks";
	var str2 = "Tutorial of Companion object";
	
	// Method of Companion class
	def show() : Unit =
	{
		println(str1);
		println(str2);
	}
}

// Companion object
object ScalaCompanionObject
{
	def main(args: Array[String]) : Unit =
	{
		var obj = new ScalaCompanionObject();
		obj.show();
	}
}
