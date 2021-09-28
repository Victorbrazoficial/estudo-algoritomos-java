package estrutura.repeticao;

// Loop Semafaro. Quando da o tempo estimado o sinal fica verde, amarelo e vermelho.
public class SemafaroEstruturaDeRepeticao {

    public static void main(String[] args) throws InterruptedException {

        while (true) { // Repetição aninhada. loop infinito enquanto for "True"

            int semafaroVerde, semafaroAmarelo, semafaroVermelho;
            semafaroVerde = 30;
            semafaroAmarelo = 10;
            semafaroVermelho = 20;

            System.out.println("-----------------------------");
            System.out.println("Sinal Verde!");
            System.out.println("-----------------------------");

            while (semafaroVerde>=0) { // enquanto semafaroVerde for maior ou igual a zero repita o bloco.
               Thread.sleep(1000); // Para a função por um segundo
                System.out.println(semafaroVerde + " Segundos (verde).");
                semafaroVerde--; // semafaroVerde - 1
            }

            System.out.println("-----------------------------");
            System.out.println("Sinal Amarelo!");
            System.out.println("-----------------------------");

            while (semafaroAmarelo>=0) { // enquanto semafaroAmarelo for maior ou igual a zero repita o bloco.
                Thread.sleep(1000); // Para a função por um segundo
                System.out.println(semafaroAmarelo + " Segundos (amarelo).");
                semafaroAmarelo--; // semafaroAmarelo - 1
            }

            System.out.println("-----------------------------");
            System.out.println("Sinal Vermelho!");
            System.out.println("-----------------------------");

            while (semafaroVermelho>=0) { // enquanto semafaroVermelho for maior ou igual a zero repita o bloco.
                Thread.sleep(1000); // Para a função por um segundo
                System.out.println(semafaroVermelho + " Segundos (vermelho).");
                semafaroVermelho--; // semafaroVermelho - 1
            }
        }
    }
}