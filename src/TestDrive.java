public class TestDrive extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Test Drive Started");
            Thread.sleep(2000);
            System.out.println("Test Drive Completed");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
