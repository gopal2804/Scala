class Parent{
    var name="Gopal Gupta"
}

class Child1 extends Parent{
    var age=26
}

class Child2 extends Child1{
    def display() : Unit ={
        println("name "+name)
        println("age "+age)
    }
}

object ScalaMultilevelInheritence{
    def main(args: Array[String]): Unit = {
        var obj=new Child2()
        obj.display()
    }
}