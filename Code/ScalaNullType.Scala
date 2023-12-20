object ScalaNullType{
    def main(args: Array[String]): Unit = {
        def funt(x:Null) : Unit = {
            println("gfgf")
        }

        funt(null)

        //error
        // funt("hey")
    }
}