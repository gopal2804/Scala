case class CaseClass(name : String , age: Int)

object ScalaCaseClassCopyMethod{
    def main(args: Array[String]): Unit = {
        var c1=CaseClass("Gopal",26)
        println("my name is "+c1.name)
        println("my age is"+c1.age)

        var c2=c1.copy(age=24)
        println("my name is "+c2.name)
        println("my age is"+c2.age)

        //original parameter are not changed
        println("my name is "+c1.name)
        println("my age is"+c1.age)

    }
}