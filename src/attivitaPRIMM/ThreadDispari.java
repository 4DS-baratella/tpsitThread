package attivitaPRIMM;

public class ThreadDispari implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i <= 20; i+=2){
            System.out.println("Thread dispari: " + i);
        }
    }
}
