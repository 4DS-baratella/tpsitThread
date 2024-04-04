package correzioneEsSleepMethod;

public class Campana implements Runnable{
    private String suono;
    private String suonoDun;
    private int volte;
    private int tempo;

    Campana(String suono, String suonoDun, int volte, int tempo){
        this.suono = suono;
        this.suonoDun = suonoDun;
        this.volte = volte;
        this.tempo = tempo;
    }

    @Override
    public void run(){
        //Questo try catch serve a sincronizzare i thread perché hanno tempi di sleep diversi
        try{
            Thread.sleep(tempo);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        for(int i = 0; i < volte; i++){
            System.out.println(suono + "-" + suonoDun);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
