package SemaforoEs2;

public class Negoziante extends Thread{
    private int nProdotto;

    private Semaforo pieno;
    private Semaforo vuoto;

    Negoziante(int nProdotto, Semaforo  s1, Semaforo s2){
        this.nProdotto = nProdotto;
        this.pieno = s1;
        this.vuoto = s2;
    }

    public void run(){
        Main.buffer = nProdotto;
        for(int i = 0; i < 5; i++){
            vuoto.P();
            System.out.println("Rimane " + Main.buffer + " latte.");
            pieno.V();
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){}
        }
        System.out.println("Termine rifornimento.");
    }
}
