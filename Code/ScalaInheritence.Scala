class Geek1{
    var name : String ="Gopal Gupta"
}

class Geek2 extends Geek1{
    var x=20
    def display() : Unit={
        println("Author name: "+name)
        println("Number of Articles: "+x)
    }
}

object ScalaInheritence{
    def main(args: Array[String]): Unit = {
        var obj=new Geek2()
        obj.display()
    }
}