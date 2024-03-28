package attivitaPRIMM;

public class ContaThread implements Runnable{
    private String nome;

    ContaThread(String nome){
        this.nome = nome;
    }

    @Override
    public void run(){
        System.out.println(this.nome + " inizia a contare: ");
        for(int i = 0; i < 7; i++){
            System.out.println((i+1));
        }
        System.out.println("Termine conteggio.\n");
    }
}
