package esPriority;

public class Test {
    public static void main(String[] args) {
        Counter counter1 = new Counter("Counter 1");
        Counter counter2 = new Counter("Counter 2");
        Counter counter3 = new Counter("Counter 3");

        counter1.setPriority(Thread.MIN_PRIORITY);
        counter2.setPriority(Thread.NORM_PRIORITY);
        counter3.setPriority(Thread.MAX_PRIORITY);

        counter1.start();
        counter2.start();
        counter3.start();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        counter1.stopCounter();
        counter2.stopCounter();
        counter3.stopCounter();
    }
}
