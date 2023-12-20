object ScalaThrowKeyword{
    def validate(article : Int): Unit = {
        if(article < 20){
            throw new ArithmeticException("You are not eligible for internship")
        }
        else{
            println("You are eleigible for internship")
        }
    }
    def main(args: Array[String]): Unit = {
        validate(19)
    }
}