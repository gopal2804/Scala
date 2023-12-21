object ScalaRecursionGCD{

    def gcd(a: Int, b: Int) : Int={
        if(b==0)
        return a

        return gcd(b,a%b)
    }
    def main(args: Array[String]): Unit = {
        println("gcd of 12 and 18 is: "+gcd(12,18))
    }
}