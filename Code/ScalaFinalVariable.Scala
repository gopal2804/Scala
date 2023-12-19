class Shapes{
    final val area : Int=60
}

class Rectangle extends Shapes{
    override val area : Int = 100
    def display() : Unit ={
        println(area)
    }
}

object ScalaFinalVariable{
    def main(args: Array[String]): Unit = {
        var b= new Rectangle()
        b.display()
    }
}