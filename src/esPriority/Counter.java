package esPriority;

public class Counter extends Thread{
    private String nome;
    private boolean avviato;
    private int count;

    Counter(String nome){
        this.nome = nome;
        this.avviato = true;
        this.count = 0;
    }

    public void stopCounter(){
        avviato = false;
    }

    @Override
    public void run(){
        while(avviato){
            System.out.println(this.nome + ": " + count++);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
