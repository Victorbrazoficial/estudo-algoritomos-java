package estrutura.repeticao;

// Semaforo Temporizador refatorado "commit : Estudo Estrutura de Repetição (Semaforo com Temporizado)"
public class SemaforoRefatoradoUsandoFor {

    public static void main(String[] args) throws InterruptedException 
    {

// As variaveis foram inseridas em cada "for" visando evitar desperdicio de memoria enquanto ela não esta sendo ultilizada.

        while (true) // loop infinito.
        {    
                System.out.println("|SEMÁFORO VERDE|"); // Print reduzido.
                Thread.sleep(1000); // Quebra de um segundo para manter a sintonia do print junto com os "for's"

            for (int semaforoVerde = 5; semaforoVerde >= 0; semaforoVerde--) // Troca de while para "for".
            {
                System.out.println(semaforoVerde + " Segundos");
                Thread.sleep(1000); // Quebra de Segundo continua igual.
            }  

                System.out.println("|SEMÁFORO AMARELO|");
                Thread.sleep(1000);

            for (int semaforoAmarelo = 2; semaforoAmarelo >= 0; semaforoAmarelo--) // Trocado de while para "for".
            {
                System.out.println(semaforoAmarelo + " Segundos");
                Thread.sleep(1000);
            }

                System.out.println("|SEMÁFORO VERMELHO|");
                Thread.sleep(1000);

            for (int semaforoVermelho = 3; semaforoVermelho >=0; semaforoVermelho--) // Trocado de while para "for".   
            {
                System.out.println(semaforoVermelho + " Segundos");
                Thread.sleep(1000);
            }
        }
    }   
}