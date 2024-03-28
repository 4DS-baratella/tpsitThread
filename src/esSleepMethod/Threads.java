package esSleepMethod;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        /*
        //Esercizio 1
        Thread campana1 = new Thread(new Campana("din"));
        Thread campana2 = new Thread(new Campana("don"));
        Thread campana3 = new Thread(new Campana("dan"));

        campana1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        campana2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        campana3.start();
        */


        //Esercizio 3
        Thread campana1 = new Thread(new Campana("din"));
        Thread campana2 = new Thread(new Campana("don"));
        Thread campana3 = new Thread(new Campana("dan"));
        Thread campana4 = new Thread(new Campana("dun"));

        campana1.start();
        campana1.join();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        campana4.start();
        campana4.join();
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        campana2.start();
        campana2.join();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        campana4.run();
        campana4.join();
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        campana3.start();
        campana3.join();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        campana4.run();
        campana4.join();
    }
}
