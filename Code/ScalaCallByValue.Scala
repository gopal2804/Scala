object ScalaCallByValue{

    def swapp(x: Int, y:Int) : Unit ={
        var z=x
        var x=y
        var y=z
        println("x: "+x)
        println("y: "+y)
    }
    def main(args: Array[String]): Unit = {
        var x=10
        var y=20

        println("x: "+x)
        println("y: "+y)

        swapp(x,y)

        println("x: "+x)
        println("y: "+y)

    }
}