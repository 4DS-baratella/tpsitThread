package esPreVerifica;

import static java.lang.Thread.sleep;

public class Fibonacci implements Runnable{
    private int n1;
    private int n2;
    private int nMax;

    Fibonacci(int nMax){
        this.nMax = nMax;
        this.n1 = 0;
        this.n2 = 1;
    }

    @Override
    public void run(){
        for(int i = 0; i < nMax; i++){
            System.out.println(n1);
            int tmp = n1 + n2;
            n1 = n2;
            n2 = tmp;
            try{
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
