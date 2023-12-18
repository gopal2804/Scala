object Main extends Enumeration{
    type Main = Value

    val first=Value("Thrilled") // id=0
    val second=Value("Horror")  // id=1
    val third=Value("Comedy")   // id=2
    val fourth=Value("Romance") // id=3

    def main(args: Array[String]): Unit = {
        println(s"Main Movie Genres= ${Main.values}")
        println(s"The third value = ${Main.third}")
        println(s"Id of third enum is = ${Main.third.id}")

    }
}