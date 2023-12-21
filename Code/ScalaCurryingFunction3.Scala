object ScalaCurryingFunction3{
    def add(a:Int)(b:Int) = a+b

    def main(args: Array[String]): Unit = {
        println(add(30)(200))
    }
}