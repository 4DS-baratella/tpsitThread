package esContoBancario;

class ContoBancario {
    private int saldo;

    public ContoBancario(int saldoIniziale) {
        this.saldo = saldoIniziale;
    }

    //metodo sincronizzato per accesso sicuro
    public synchronized boolean preleva(int importo) {
        if (saldo >= importo) {
            saldo -= importo;
            System.out.println(Thread.currentThread().getName() + " ha prelevato " + importo + ". Saldo rimanente: " + saldo);
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() + " ha tentato di prelevare " + importo + " ma il saldo è insufficiente.");
            return false;
        }
    }

    public int getSaldo() {
        return saldo;
    }
}