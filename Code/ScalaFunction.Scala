object ScalaFunction{

    def summationa (x : Int , y: Int) : Int = {
        return x+y
    }
    def main(args: Array[String]): Unit = {
        var a=10
        var b=30
        println("The sum of "+a+" and "+b+" is: "+summationa(a,b))
    }
}