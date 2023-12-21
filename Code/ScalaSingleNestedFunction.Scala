object ScalaSingleNestedFunction{
    
    def maxAndMin(a: Int, b:Int) : Unit = {
        def findMax() : Unit ={
            if(a>b){
                println("Max is: "+a)
            }
            else{
                println("Max is: "+b)
            }
        }

        def findMin() : Unit = {
            if(a<b){
                println("Min is: "+a)
            }
            else{
                println("Min is: "+b)
            }
        }

        findMax()
        findMin()
    }
    
    
    def main(args: Array[String]): Unit = {
        println("Max and Min from 5,7 is")
        maxAndMin(5,7)
    }
}