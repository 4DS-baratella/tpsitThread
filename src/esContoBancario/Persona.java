package esContoBancario;

import java.util.Random;

public class Persona extends Thread{
    private String nome, cognome;
    private ContoBancario contoBancario;

    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            prelievo();
        }
    }

    public void prelievo(){
        Random random = new Random();
        int prelievo = random.nextInt();
        contoBancario.prelievo(prelievo);
    }
}
