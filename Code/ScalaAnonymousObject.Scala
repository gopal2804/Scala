class GFG{
    def display() : Unit ={
        println("Welcome to ScalaAnonymousObject")
    }
}

object ScalaAnonymousObject{
    def main(args: Array[String]): Unit = {
        new GFG().display()
    }
}