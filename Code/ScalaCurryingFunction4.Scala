object ScalaCurryingFunction4{
    def add(a:Int)(b:Int) = a+b

    def main(args: Array[String]): Unit = {
        var sum=add(100)_
        println(sum(200))
    }
}