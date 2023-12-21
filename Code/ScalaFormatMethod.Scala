object ScalaFormatMethod{
    def main(args: Array[String]): Unit = {
        val x= "there are %d books and"+" cost of each book is %f"

        val y =15
        val z=345.25

        val r= x.format(y,z)
        println(r)
    }
}