object ScalaRepeatedMethodParameters{
    def main(args: Array[String]): Unit = {
        def add(x : Int*) : Int={
            // Applying 'fold' method to  
            // perform binary operation 
            x.fold(0)(_+_)
        }
        println(add(2,3))
        println(add(2,3,5,9,6,10,11,12))
    }
}