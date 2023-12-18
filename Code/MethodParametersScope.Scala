class rect{
    //s1 and s2 are method parameters
    def mult(s1 : Int , s2: Int) : Unit ={
        var result=s1*s2
        println("Area is: "+result)
    }
}

object MethodParametersScope{
    def main(args: Array[String]): Unit = {
        val su=new rect()
        su.mult(10,20)
    }
}
