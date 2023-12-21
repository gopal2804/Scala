object PartiallyAppliedFunction2{
    def main(args: Array[String]): Unit = {
        def mult(x: Double, y: Double) : Double = {
            return x*y
        }

        var r=mult _ 
        println(r(9,8))
    }
}