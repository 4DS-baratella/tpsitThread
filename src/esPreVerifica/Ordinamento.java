package esPreVerifica;

public class Ordinamento implements Runnable{
    private String ordinamento;
    private int n1;
    private int n2;
    private int n3;

    Ordinamento(int n1, int n2, int n3, String ordinamento){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.ordinamento = ordinamento;
    }

    @Override
    public void run(){
        if(ordinamento.toLowerCase().equals("crescente")){
            System.out.println("Ordine crescente: ");
            if(n1 < n2 && n1 < n3){
                System.out.println(n1);
                if(n2 < n3){
                    System.out.println(n2);
                    System.out.println(n3);
                }else{
                    System.out.println(n3);
                    System.out.println(n2);
                }
            }else if(n2 < n1 && n2 < n3){
                System.out.println(n2);
                if(n1 < n3){
                    System.out.println(n1);
                    System.out.println(n3);
                }else{
                    System.out.println(n3);
                    System.out.println(n1);
                }
            }else{
                System.out.println(n3);
                if(n1 < n2){
                    System.out.println(n1);
                    System.out.println(n2);
                }else{
                    System.out.println(n2);
                    System.out.println(n1);
                }
            }
            System.out.println();
        }else if(ordinamento.toLowerCase().equals("decrescente")){
            System.out.println("Ordine decrescente: ");
            if(n1 > n2 && n1 > n3){
                System.out.println(n1);
                if(n2 > n3){
                    System.out.println(n2);
                    System.out.println(n3);
                }else{
                    System.out.println(n3);
                    System.out.println(n2);
                }
            }else if(n2 > n1 && n2 > n3){
                System.out.println(n2);
                if(n1 > n3){
                    System.out.println(n1);
                    System.out.println(n3);
                }else{
                    System.out.println(n3);
                    System.out.println(n1);
                }
            }else{
                System.out.println(n3);
                if(n1 > n2){
                    System.out.println(n1);
                    System.out.println(n2);
                }else{
                    System.out.println(n2);
                    System.out.println(n1);
                }
            }
            System.out.println();
        }
    }
}
