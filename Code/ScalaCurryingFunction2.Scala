object ScalaCurryingFunction2{
    def add(a: Int) = (b: Int) => a+b

    def main(args: Array[String]): Unit = {
        println(add(12)(30))
    }
}