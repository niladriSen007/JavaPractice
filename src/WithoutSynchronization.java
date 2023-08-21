public class WithoutSynchronization {


   static int ticketCount = 10;


    //Without Synchronization
//    public void printTable(int n) throws InterruptedException {
//        for (int i = 1; i <= n; i++) {
//            System.out.println(n * i);
//            try {
//                Thread.sleep(2000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }




    //Without Synchronization
    public synchronized void printTable(int n) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    synchronized static void bookTicket(int n) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
            System.out.println(ticketCount > n ?
                    "Tickets Left "+(ticketCount -= n) :
                    "Not enough Tickets");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

    }


}





