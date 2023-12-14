object Pattern{
	def main(args: Array[String]): Unit = {
		println(test(2));
	}
	def test(x:Int) : String = x match{
		case 0 => "hello case 0"
		case 1 => "hello case 1"
		case _ => "not found"
	}
}