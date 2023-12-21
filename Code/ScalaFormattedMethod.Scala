object ScalaFormattedMethod{
    def main(args: Array[String]): Unit = {
        val x=30
        val r=x.formatted("I have written %d articles")
        println(r)
    }
}