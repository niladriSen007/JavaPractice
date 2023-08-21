public class OfficerSign extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Officer Sign Started");
            Thread.sleep(2000);
            System.out.println("Officer Sign Completed");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
