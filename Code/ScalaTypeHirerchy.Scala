object ScalaTypeHirerchy{
    def main(args: Array[String]): Unit = {
        val list : List[Any] = List(
            false,
            66677,
            732,
            'a',
            "abs"
        )

        list.foreach(element => println(element))
    }
}