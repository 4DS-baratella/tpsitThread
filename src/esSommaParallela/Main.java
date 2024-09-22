package esSommaParallela;

public class Main {
    public static void main(String[] args) {
        int[] numeri = {2, 5, 8, 12, 3, 7, 10, 6};

        //creo task di somma
        SommaParallela task1 = new SommaParallela(numeri, 0, 3);
        SommaParallela task2 = new SommaParallela(numeri, 4, 7);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        try {
            //aspetto che i thread finiscano l'esecuzione
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //somma risultati
        int sommaTotale = task1.getRisultato() + task2.getRisultato();
        System.out.println("Somma totale: " + sommaTotale);
    }
}
