class Parent{
    var name = "GG"
}

class Child extends Parent{
    var age=26
    def display() : Unit={
        println("Name: "+name)
        println("Age: "+age)
    }
}

object ScalaSingleInheritence{
    def main(args: Array[String]): Unit = {
        var obj=new Child()
        obj.display()
    }
}
