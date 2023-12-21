object ScalaNamedArguments{

    def funct(x: Int, y:Int) : Unit ={
        println("x: "+x)
        println("y: "+y)
    }
    def main(args: Array[String]): Unit = {
        funct(y=30,x=20)
    }
}