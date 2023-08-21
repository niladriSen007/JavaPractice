public class ThreadClass extends Thread{

    @Override
    public void run() {

        try{
            for(int i=0;i<5;i++){
                System.out.println("Child Thread" + i);
                Thread.sleep(2000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
