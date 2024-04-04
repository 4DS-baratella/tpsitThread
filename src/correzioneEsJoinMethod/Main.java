package correzioneEsJoinMethod;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            Thread campana1 = new Thread(new Campana("Din", null), "Campana 1");
            Thread campana2 = new Thread(new Campana("Don", campana1), "Campana 2");
            Thread campana3 = new Thread(new Campana("Dan", campana2), "Campana 3");

            campana1.start();
            campana2.start();
            campana3.start();

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
