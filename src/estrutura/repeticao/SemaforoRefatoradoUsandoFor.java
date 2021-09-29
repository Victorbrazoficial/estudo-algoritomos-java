package estrutura.repeticao;

public class SemaforoRefatoradoUsandoFor {

    public static void main(String[] args) throws InterruptedException 
    {
        
        while (true) 
        {    
                System.out.println("|SEMÁFORO VERDE|");
                Thread.sleep(1000);

            for (int semaforoVerde = 5; semaforoVerde >= 0; semaforoVerde--)
            {
                System.out.println(semaforoVerde + " Segundos");
                Thread.sleep(1000);
            }  

                System.out.println("|SEMÁFORO AMARELO|");
                Thread.sleep(1000);
            for (int semaforoAmarelo = 2; semaforoAmarelo >= 0; semaforoAmarelo--)
            {
                System.out.println(semaforoAmarelo + " Segundos");
                Thread.sleep(1000);
            }

                System.out.println("|SEMÁFORO VERMELHO|");
                Thread.sleep(1000);
            for (int semaforoVermelho = 3; semaforoVermelho >=0; semaforoVermelho--)    
            {
                System.out.println(semaforoVermelho + " Segundos");
                Thread.sleep(1000);
            }
        }
    }   
}