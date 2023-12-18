trait Geek1{
    def method1() : Unit
}

trait Geek2{
    def method2() : Unit
}

class GFG extends Geek1 with Geek2{
    def method1() : Unit = {
        println("Trait 1")
    }
    def method2() : Unit = {
        println("Trait 2")
    }
}

object ScalaMultipleInheritence{
    def main(args: Array[String]): Unit = {
        var obj = new GFG()
        obj.method1()
        obj.method2()
    }

}