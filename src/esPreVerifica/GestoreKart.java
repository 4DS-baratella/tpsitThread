package esPreVerifica;

import static java.lang.Thread.sleep;

public class GestoreKart implements Runnable{
    private int numPiloti;
    private int numKart;
    private int maxGiri;
    private Thread[] goKart;

    GestoreKart(int numPiloti, int numKart, int maxGiri, Thread[] goKart){
        this.numPiloti = numPiloti;
        this.numKart = numKart;
        this.maxGiri = maxGiri;
        this.goKart = goKart;
    }

    @Override
    public void run(){
        int counterKart = 0;
        boolean currentKart = false;
        for(int i = 0; i < goKart.length; i++){
            while(!currentKart){
                if(counterKart <= 4){
                    goKart[i].run();
                    counterKart++;
                    currentKart = true;
                }else{
                    try{
                        sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                try{
                    goKart[i].join();
                    counterKart--;
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
