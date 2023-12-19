class Shapes{
    val desp : String = "shape"
}

class Circle extends Shapes{
    override val desp : String = "It is circle"
    def display() : Unit = {
        println(desp)
    }
}

class Square extends Shapes{
    override val desp : String = "Its square"
    def display() : Unit ={
        println(desp)
    }
}

object ScalaFieldOverriding{
    def main(args: Array[String]): Unit = {
        var c=new Circle()
        var s=new Square()

        c.display()
        s.display()
    }
}