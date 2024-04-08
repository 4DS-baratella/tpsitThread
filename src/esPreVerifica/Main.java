package esPreVerifica;

public class Main {
    public static void main(String[] args) {
        /*
        //Esercizio 1
        Thread thread1 = new Thread(new Ordinamento(1, 2, 3, "decrescente"));
        Thread thread2 = new Thread(new Ordinamento(2, 3, 1, "crescente"));

        thread1.start();
        try{
            thread1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thread2.start();
         */


        /*
        //Esercizio 2
        Thread thread1 = new Thread(new Fibonacci(10));
        thread1.start();
         */


        //Esercizio 3
        int numPiloti = 8;
        int numKart = 4;
        int maxGiri = 15;

        Thread[] idKart = new Thread[numPiloti];
        for(int i = 0; i < numPiloti; i++){
            idKart[i] = new Thread(new GoKart(i));
        }

        Thread gestoreKart = new Thread(new GestoreKart(numPiloti, numKart, maxGiri, idKart));
    }
}
