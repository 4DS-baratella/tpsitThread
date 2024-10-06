package esSalaAzienda;

public class PersonaTecnici implements Runnable{
    private static int contatore = 0;
    private int id;
    private Sala sala;
    private int counterEsecuzioni;

    PersonaTecnici(Sala sala){
        this.id = ++contatore;
        this.sala = sala;
    }

    @Override
    public void run(){
        try{
            while(sala.getSemaphore().tryAcquire() && this.counterEsecuzioni == 0){
                counterEsecuzioni++;
                sala.getSemaphore().acquire();
                System.out.println("Team tecnici (tecnico " + this.id + ") è entrato. Persone attualmente nella sala: " + sala.numPermessi());

                try{
                    Thread.sleep(200);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                sala.getSemaphore().release();
                System.out.println("Team tecnici (tecnico " + this.id + ") è uscito. Persone attualmente nella sala: " + sala.numPermessi());
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        Thread.currentThread().interrupt();
    }
}
