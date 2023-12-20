import java.io.IOException

object ScalaExceptionHandling{
    def main(args: Array[String]): Unit = {
        try{
            var n = 5/0
        }
        catch{
            case i: IOException => 
                {
                    println("IOException occured")
                }
            case a: ArithmeticException  =>
                {
                    println("ArithmeticException  occured")
                }
        }
    }
}