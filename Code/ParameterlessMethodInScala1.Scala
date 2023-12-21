
class Example(name: String, article: Int){
    def author=println(name)
    def articleName=println(article)
}

object ParameterlessMethodInScala1{
    def main(args: Array[String]): Unit = {
        var obj=new Example("gopal",30)
        obj.author
        obj.articleName

        //compile time error
        // obj.author()

    }
}