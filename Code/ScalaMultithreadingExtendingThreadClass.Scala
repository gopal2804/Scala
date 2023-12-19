

class Mythread extends Thread{
    override def run() : Unit = {
        println("Thread " + Thread.currentThread().getName()+" is running")
    }
}
object ScalaMultithreadingExtendingThreadClass{
    def main(args: Array[String]): Unit = {
        for(x <- 1 to 5){
            var th=new Mythread()
            th.setName(x.toString())
            th.start()
        }
    }
}