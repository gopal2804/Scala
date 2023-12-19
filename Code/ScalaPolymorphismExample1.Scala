class Example{
    def funt(a:Int) : Unit ={
        println("First execution "+a)
    }
    def funt(a:Int,b:Int) : Unit ={
        println("Second execution "+(a+b))
    }
    def funt(a:Int,b:Int,c:Int) : Unit ={
        println("Third execution "+(a*b*c))
    }
}

object ScalaPolymorphismExample1{
    def main(args: Array[String]): Unit = {
        var obj=new Example()
        obj.funt(12)
        obj.funt(10,20)
        obj.funt(1,2,4)
    }
}