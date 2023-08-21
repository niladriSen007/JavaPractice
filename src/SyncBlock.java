public class SyncBlock {
    static int ticketCount = 10;

    void bookTicket(int n) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        synchronized  (this){
            System.out.println(this.ticketCount > n ?
                    "Tickets Left "+(this.ticketCount -= n) :
                    "Not enough Tickets");
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

    }
}
