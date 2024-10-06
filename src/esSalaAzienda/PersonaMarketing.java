package esSalaAzienda;

public class PersonaMarketing implements Runnable{
    private static int contatore = 0;
    private int id;
    private Sala sala;

    PersonaMarketing(Sala sala){
        this.id = ++contatore;
        this.sala = sala;
    }

    @Override
    public void run(){
        try{
            while(sala.getSemaphore().tryAcquire()){
                sala.getSemaphore().acquire();
                System.out.println("Team marketing (marketing " + this.id + ") è entrato. Persone attualmente nella sala: " + sala.numPermessi());

                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

                System.out.println("Team marketing (marketing " + this.id + ") è uscito. Persone attualmente nella sala: " + sala.numPermessi());
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        Thread.currentThread().interrupt();
    }
}
