package esSalaAzienda;

public class Main {
    public static void main(String[] args) throws Exception{
        int numMaxPersone = 3;

        Sala sala = new Sala(numMaxPersone);

        Thread tecnico1 = new Thread(new PersonaTecnici(sala));
        Thread tecnico2 = new Thread(new PersonaTecnici(sala));
        Thread tecnico3 = new Thread(new PersonaTecnici(sala));

        Thread marketing1 = new Thread(new PersonaMarketing(sala));
        Thread marketing2 = new Thread(new PersonaMarketing(sala));
        Thread marketing3 = new Thread(new PersonaMarketing(sala));

        tecnico1.start();
        tecnico2.start();
        tecnico3.start();

    }
}
