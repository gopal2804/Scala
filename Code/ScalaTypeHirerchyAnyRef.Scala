object ScalaTypeHirerchyAnyRef{
    def main(args: Array[String]): Unit = {
        val list : List [AnyRef]= List(
            "gfg", "geeksforgeeks"
        )

        list.foreach(ele => println(ele))
    }

}