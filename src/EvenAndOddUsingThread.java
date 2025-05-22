public class EvenAndOddUsingThread {
     int i =1;
     int max = 10;

     public synchronized void printEven() throws  InterruptedException{
         while (i<=max){
             if(i%2 == 0){
                 System.out.println( i++ +" Is Even");
                 notify();
             }else{
                 wait();
             }
         }
     }

    public synchronized void printOdd() throws  InterruptedException{
        while (i<=max){
            if(i%2 != 0){
                System.out.println(i++ +" Is Odd");
                notify();
            }else{
                wait();
            }
        }
    }

    public static void main(String[] args) {
         EvenAndOddUsingThread evenAndOddUsingThread = new EvenAndOddUsingThread();
         Thread t1 = new Thread(()-> {
             try {
                 evenAndOddUsingThread.printEven();
             } catch (Exception e) {
                 System.out.println("Thread is Interrupted");
             }
         });
        Thread t2 = new Thread(()-> {
            try {
                evenAndOddUsingThread.printOdd();
            } catch (Exception e) {
                System.out.println("Thread is Interrupted");
            }
        });

        t1.start();
        t2.start();
    }
}
