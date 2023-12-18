
class GFG(aname :String , cname: String){
    var no : Int=0
    def display() : Unit ={
        println("Author name: "+aname)
        println("Chapter name: "+cname)
        println("Total number of articles: "+no)
    }
    
    def this(aname: String, cname: String, no: Int) ={
        this(aname,cname)
        this.no=no
    }


}

object ScalaAuxiliaryConstructor{
    def main(args: Array[String]): Unit = {
        var obj=new GFG("gopal gupta","maths",120)
        obj.display()
    }
}