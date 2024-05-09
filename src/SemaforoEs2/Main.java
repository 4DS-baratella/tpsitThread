package SemaforoEs2;

import com.sun.org.apache.xpath.internal.operations.Neg;

public class Main {
    protected static int buffer;
    public static void main(String[] args) {
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        Cliente cliente1 = new Cliente("Carlo", pieno, vuoto);
        Cliente cliente2 = new Cliente("Matilde", pieno, vuoto);
        Cliente cliente3 = new Cliente("Francesco", pieno, vuoto);
        Negoziante negoziante = new Negoziante(300, pieno, vuoto);
        negoziante.start();
        cliente1.start();
        cliente2.start();
        cliente3.start();
    }
}
