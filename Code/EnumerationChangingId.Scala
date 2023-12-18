object EnumerationChangingId extends Enumeration{
    type Main = Value
    val first=Value(0,"thrilled")
    val second=Value(-1,"Horror")
    val third=Value(-3,"comedy")
    val fourth=Value(4,"romance")

    def main(args: Array[String]): Unit = {
        println(s"the movie genres= ${Main.values}")
    }
}