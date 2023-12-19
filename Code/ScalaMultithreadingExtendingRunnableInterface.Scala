
class MyThread extends Runnable{
    override def run() : Unit = {
        println("Thread "+Thread.currentThread().getName()+" is running")
    }
}

object ScalaMultithreadingExtendingRunnableInterface{
    def main(args: Array[String]): Unit = {
        for(x <- 1 to 5){
            var th=new Thread(new MyThread())
            th.setName(x.toString())
            th.start()
        }
    }
}