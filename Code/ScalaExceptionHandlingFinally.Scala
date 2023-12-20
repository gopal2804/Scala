object ScalaExceptionHandlingFinally{
    def main(args: Array[String]): Unit = {
        try{
            var n = 30/0
        }
        catch{
            case a : ArithmeticException  =>{
                println("ArithmeticException occured")
            }
        }
        finally{
            println("Inside finally block")
        }
    }
}