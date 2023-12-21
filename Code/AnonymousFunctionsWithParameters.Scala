object AnonymousFunctionsWithParameters{
    def main(args: Array[String]): Unit = {
        var str=(str1: String, str2: String) => str1+str2
        var str3=(_:String)+(_:String)

        println(str("geeks"," for geeks"))
        println(str3("gopal"," gupta"))
    }
}