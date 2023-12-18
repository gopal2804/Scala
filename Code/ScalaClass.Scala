class Smartphone{
    var number : Int =10
    var compnay_name : String = "Apple"

    def display() : Unit = {
        println("The comapny name is : "+compnay_name)
        println("Number of smartphones available: "+number)
    }
}

object ScalaClass{
    def main(args: Array[String]): Unit = {
        val obj=new Smartphone()
        obj.display()
    }
}