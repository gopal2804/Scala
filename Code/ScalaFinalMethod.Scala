class Shapes{
    val height : Int=0
    val width : Int=0
    final def CalArea() : Unit = {

    }
}

class Rectangle extends Shapes{
    override def CalArea() : Unit = {
        val area : Int = height*width
        println(area)
    }
}

object ScalaFinalMethod{
    def main(args: Array[String]): Unit = {
        var b =new Rectangle()
        b.CalArea()
    }
}