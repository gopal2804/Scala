object PartiallyAppliedFunction1{
    def main(args: Array[String]): Unit = {
        def Book(discount: Double , costprice: Double) : Double = {
            return (1-discount/100) * costprice
        }

        val discountedPrice=Book(25,_:Double)

        println(discountedPrice(400))
    }
}