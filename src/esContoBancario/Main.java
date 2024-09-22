package esContoBancario;

public class Main {
    public static void main(String[] args) {
        ContoBancario contoCondiviso = new ContoBancario(100); // Inizializza il conto con 100

        Thread persona1 = new Thread(new Persona(contoCondiviso), "Persona 1");
        Thread persona2 = new Thread(new Persona(contoCondiviso), "Persona 2");
        Thread persona3 = new Thread(new Persona(contoCondiviso), "Persona 3");

        persona1.start();
        persona2.start();
        persona3.start();
    }
}
