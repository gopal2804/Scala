object Rangee{
    def main(args: Array[String]): Unit = {
        val x= Range(3,10,1)

        //display the whole range        
        println(x)
        //display the first value of the range
        println(x(0))
        //displya the last value of the range
        println(x.last)
    }
}