package esPreVerifica;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Ordinamento(1, 2, 3, "decrescente"));
        Thread thread2 = new Thread(new Ordinamento(2, 3, 1, "crescente"));

        thread1.start();
        try{
            thread1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thread2.start();
    }
}
