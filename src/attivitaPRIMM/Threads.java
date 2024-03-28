package attivitaPRIMM;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        /*
        //Esercizio comprensione thread
        EsercizioUno thr1 = new EsercizioUno();
        thr1.start();
        System.out.println(Thread.currentThread().getName());
         */


        /*
        //Esercizio 1
        ContaThread contaThread1 = new ContaThread("Thread 1");
        ContaThread contaThread2 = new ContaThread("Thread 2");

        Thread thread1 = new Thread(contaThread1);
        Thread thread2 = new Thread(contaThread2);

        thread1.run();
        thread2.run();è
         */


        /*
        //Esercizio 2
        String[] nomiNani = {"Mammolo", "Brontolo", "Eolo", "Pisolo", "Dotto", "Gongolo", "Cucciolo"};
        Thread[] threads = new Thread[nomiNani.length];

        for(int i = 0; i < nomiNani.length; i++){
            ContaThread contaThread = new ContaThread(nomiNani[i]);
            threads[i] = new Thread(contaThread);
        }

        for(Thread thread : threads){
            thread.start();
            thread.join();
        }
        */


        /*
        //Esercizio 4
        ThreadPari threadPari1 = new ThreadPari();
        ThreadDispari threadDispari1 = new ThreadDispari();

        threadPari1.run();
        threadDispari1.run();
        */


        /*
        //Esercizio 5
        Thread campana1 = new Thread(new Campana("din", 5));
        Thread campana2 = new Thread(new Campana("don", 4));
        Thread campana3 = new Thread(new Campana("dan", 3));

        campana1.run();
        campana2.run();
        campana3.run();
        */
    }
}
