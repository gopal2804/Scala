object ScalaRecursionFactorial{

    def fact(a: Int): Int = {
        if(a==1)
        return 1

        else
        return a*fact(a-1)
    }
    def main(args: Array[String]): Unit = {
        println(fact(5))
    }
}