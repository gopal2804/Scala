
abstract class Myauthor{
    def details() : Unit
}

class GFG extends Myauthor{
    def details() : Unit = {
        println("Name: gopal")
        println("Age: 26")
    }
}

object ScalaAbstractClass{
    def main(args: Array[String]): Unit = {
        var obj=new GFG()
        obj.details()
    }
}