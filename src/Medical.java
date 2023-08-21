public class Medical extends Thread{

    Medical(String name){
        super(name);
    }
    @Override
    public void run() {
        try{
            System.out.println("Medical Started");
            Thread.sleep(2000);
            System.out.println("Medical Completed");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
