class Example{
    def display(str: String) : Unit = {
        println(str)
    }
}

object ScalaMethodInvocation{
    def main(args: Array[String]): Unit = {
        var obj=new Example
        obj.display("gopal")
        obj display ("gopal")
        obj display "gopal"
    }
}