package esContoBancario;

import java.util.Random;

class Persona implements Runnable {
    private ContoBancario conto;

    public Persona(ContoBancario conto) {
        this.conto = conto;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) { // Ogni persona tenta di prelevare 5 volte
            int importo = rand.nextInt(50) + 1; // Preleva un importo casuale tra 1 e 50
            conto.preleva(importo);
            try {
                Thread.sleep(100); // Simula una pausa tra i prelievi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
