package esContoBancario;

public class Main {
    public static void main(String[] args) {
        ContoBancario contoBancario = new ContoBancario(100);

        Thread p1 = new Thread(new Persona("mario", "rossi"));
        Thread p2 = new Thread(new Persona("luca", "bianchi"));
        Thread p3 = new Thread(new Persona("giovanni", "verdi"));

        p1.start();
        p2.start();
        p3.start();
    }
}
