class disp{

    //fields memeber scope
    var x=10.3f
    var y=7f

    def windet(): Unit=
    {
        println("Value of x: "+x)
    }
    println("Value of y: "+y)
}

object FieldScope{
    def main(args: Array[String]): Unit = {
        val obj=new disp()
        obj.windet()
    }
}