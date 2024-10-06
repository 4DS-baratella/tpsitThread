package esCaffetteria;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        int numBevande = 2;
        CountDownLatch latch = new CountDownLatch(numBevande);

        Thread caffe = new Thread(new PreparazioneBevanda("Caffè", latch));
        Thread latte = new Thread(new PreparazioneBevanda("Latte", latch));

        caffe.start();
        latte.start();

        try{
            latch.await();
            System.out.println("Bevande pronte! Caffè e latte sono stati preparati.  ");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
