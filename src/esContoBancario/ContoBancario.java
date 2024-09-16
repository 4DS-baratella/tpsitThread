package esContoBancario;

public class ContoBancario{
    private int saldo;

    public ContoBancario(int saldo) {
        this.saldo = saldo;
    }

    public synchronized void prelievo(int prelievo){
        if((saldo -= prelievo) >= 0){
            saldo -= prelievo;
            System.out.println("Prelevati " + prelievo + " euro");
        }else{
            System.out.println("Il prelievo che si vuole effettuare supera il saldo");
        }
    }

    public synchronized void deposito(int deposito){
        if((saldo += deposito) < 0){
            saldo += deposito;
            System.out.println("Depositati " + deposito + " euro");
        }else{
            System.out.println("E' stato inserito un valore errato");
        }
    }
}
