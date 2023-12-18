class Geek{
    class G1{
        var a=0
        def method() : Unit = {
            for(a <- 0 to 3){
                println("Welcome to inner class G1")
            }
        }
    }
}

object ScalaInnerClass{
    def main(args: Array[String]): Unit = {
        val obj=new Geek()
        val o=new obj.G1()
        o.method()
    }
}