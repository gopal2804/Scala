class C1{
    object O1{
        val q = 0
        def method():Unit={
            for(q <- 0 to 2){
                println("Oject inside class")
            }
            println()
        }
    }
}

object O2{
    class C2{
        val q = 0
        def method():Unit={
            for(q <- 0 to 2){
                println("Class inside object")
            }
            println()
        }
    }
}

object ScalaObjectInsideClassOrClassInsideObject{
    def main(args: Array[String]): Unit = {
        new C1().O1.method()
        new O2.C2().method()
    }
}