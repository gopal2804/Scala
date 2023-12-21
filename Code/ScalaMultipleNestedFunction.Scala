object ScalaMultipleNestedFunction{
    
    def fun1() : Unit = {
        println("Welcome to fun1")

        fun2()
        def fun2() : Unit= {
            println("Welcome to fun2")

            fun3()
            def fun3() : Unit ={
                println("Welcome to fun3")

                fun4()
                def fun4() : Unit = {
                    println("Welcome to fun4")
                }
            }
        }
    }
    
    def main(args: Array[String]): Unit = {
        fun1()
    }
}