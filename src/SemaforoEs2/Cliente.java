package SemaforoEs2;

import java.util.Random;

public class Cliente extends Thread{
    private String nome;
    private Semaforo pieno;
    private Semaforo vuoto;

    Cliente(String nome, Semaforo s1, Semaforo s2){
        this.nome = nome;
        this.pieno = s1;
        this.vuoto = s2;
    }

    public void run(){
        while(true){
            pieno.P();
            Random rand = new Random();
            int ordine = rand.nextInt(18)+3;
            Main.buffer -= ordine;
            System.out.println(this.nome + " ha ordinato " + ordine + " latte");
            vuoto.V();
        }
    }
}
