case class Subject(languageName : String , topicName : String)

object ScalaObjectEquality{
    def main(args: Array[String]): Unit = {
        var x= Subject("Scala","Equality")
        var y= Subject("Scala","Equality")
        var z= Subject("Java","Array")

        println(x.equals(y))
        println(x==y)
        println(x.equals(z))
        println(y==z)
    }
}