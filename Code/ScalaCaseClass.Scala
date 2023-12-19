
case class CaseClass(name : String , age : Int)

object ScalaCaseClass{
    def main(args: Array[String]): Unit = {
        var c=CaseClass("gopal",26)
        println("my name is: "+c.name)
        println("my age is: "+c.age)
    }
}