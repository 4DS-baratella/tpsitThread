package esSommaParallela;

class SommaParallela implements Runnable {
    private int[] numeri;
    private int inizio, fine;
    private int risultato;

    public SommaParallela(int[] numeri, int inizio, int fine) {
        this.numeri = numeri;
        this.inizio = inizio;
        this.fine = fine;
        this.risultato = 0;
    }

    public int getRisultato() {
        return risultato;
    }

    @Override
    public void run() {
        for (int i = inizio; i <= fine; i++) {
            risultato += numeri[i];
        }
    }
}