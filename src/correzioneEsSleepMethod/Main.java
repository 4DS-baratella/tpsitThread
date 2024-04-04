package correzioneEsSleepMethod;

public class Main {
    public static void main(String[] args) {
        Thread campana1 = new Thread(new Campana("Din", "Dun", 3, 700), "Campana 1");
        Thread campana2 = new Thread(new Campana("Don", "Dun", 3, 800), "Campana 2");
        Thread campana3 = new Thread(new Campana("Dan", "Dun", 3, 900), "Campana 3");

        campana1.start();
        campana2.start();
        campana3.start();
    }
}
