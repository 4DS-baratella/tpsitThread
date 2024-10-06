package esSalaAzienda;

import java.util.concurrent.Semaphore;

public class Sala{
    private Semaphore semaphore;

    Sala(int numMaxPersone){
        this.semaphore = new Semaphore(numMaxPersone);
    }

    public synchronized Semaphore getSemaphore() {
        return semaphore;
    }

    public synchronized int numPermessi() {
        int num = 0;
        switch (this.getSemaphore().availablePermits()){
            case 0:
                num = 2;
                break;
            case 1:
                num = 1;
                break;
            case 2:
                num = 0;
                break;
        }
        return num;
    }
}
