class Keyword{
    var `name`="Gopal"
    var age=26
    var branch ="cse"

    def show(): Unit={
        println("Hello! my name is "+`name`+" and my age is "+age)
        println("My branch name is "+branch)
    }
}

object GFG{
    def main(args: Array[String]): Unit = {
        var ob=new Keyword();
        ob.show();
    }
}