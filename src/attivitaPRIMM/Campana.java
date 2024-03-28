package attivitaPRIMM;

public class Campana implements Runnable{
    private String suono;
    private int rintocchi;

    Campana(String suono, int rintocchi){
        this.suono = suono;
        this.rintocchi = rintocchi;
    }

    @Override
    public void run(){
        for(int i = 0; i < rintocchi; i++){
            System.out.println("Rintocco numero " + (i+1) + ": " + this.suono);
        }
        System.out.println("\n");
    }
}
