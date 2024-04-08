package esPreVerifica;

import static java.lang.Thread.sleep;

public class GoKart implements Runnable{
    private int id;

    GoKart(int id){
        this.id = id;
    }

    @Override
    public void run(){
        for(int giro = 0; giro < 15; giro++){
            System.out.println("Il kart \"" + id + "\" sta completando il giro: " + giro);
            try{
                sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
