package esCaffetteria;

import java.util.concurrent.CountDownLatch;

public class PreparazioneBevanda implements Runnable{
    private String nome;
    private CountDownLatch latch;

    PreparazioneBevanda(String nome, CountDownLatch latch){
        this.nome = nome;
        this.latch = latch;
    }

    @Override
    public void run(){
        try{
            System.out.println("Preparazione del " + nome + " in corso...");
            Thread.sleep(2000);
            System.out.println(nome + " pronto!");
            latch.countDown();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
