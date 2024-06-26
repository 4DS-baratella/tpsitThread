package SemaforoEs2;

import java.net.Inet4Address;

public class Semaforo {
    private int valore;

    public Semaforo(int valore){
        this.valore = valore;
    }

    synchronized public void P(){
        while(valore == 0){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        valore--;
    }

    synchronized public void V(){
        valore++;
        notify();
    }
}
