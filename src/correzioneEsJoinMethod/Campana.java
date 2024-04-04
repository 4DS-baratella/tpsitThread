package correzioneEsJoinMethod;

public class Campana implements Runnable{
    private String suono;
    private Thread t;

    Campana(String suono, Thread t){
        this.suono = suono;
        this.t = t;
    }

    @Override
    public void run(){
        try{
            if(t != null){
                t.join();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(suono);
    }
}