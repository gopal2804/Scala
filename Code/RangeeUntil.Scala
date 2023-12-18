object RangeeUntil{
    def main(args: Array[String]): Unit = {
        val x=Range(0,10,2)
        //here by is used for increments
        val y=0 until 10 by 2

        println(x==y)
    }
}