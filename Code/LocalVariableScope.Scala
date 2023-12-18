
class rect{
    def mult(): Unit={
        var (s1,s2)=(10,20)
        var s=s1*s2
        println("the area is: "+s)
    }
}

object LocalVariableScope{
    def main(args: Array[String]): Unit = {
        val obj=new rect()
        obj.mult()
    }
}