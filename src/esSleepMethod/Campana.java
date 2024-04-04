package esSleepMethod;

public class Campana implements Runnable{
    private String suono;

    Campana(String suono){
        this.suono = suono;
    }

    @Override
    public void run() {
        System.out.println(this.suono);
    }
}