object ScalaTypeHirerchyAnyVal{
    def main(args: Array[String]): Unit = {
        val list : List[AnyVal] = List (
            333,true,false
        )
        list.foreach(ele => println(ele))
    }
}