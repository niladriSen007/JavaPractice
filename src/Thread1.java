public class Thread1 extends Thread{

    WithoutSynchronization w;
    SyncBlock s;
    Thread1(WithoutSynchronization w){
        this.w = w;
    }

//    Thread1(SyncBlock s){
//        this.s = s;
//    }
    @Override
    public void run(){
        try {
//            w.printTable(5);
//            s.bookTicket(3);
            w.bookTicket(3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

