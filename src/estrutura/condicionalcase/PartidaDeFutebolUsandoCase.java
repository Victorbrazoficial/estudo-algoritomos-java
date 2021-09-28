package estrutura.condicionalcase;

// Codigo responde se foi uma partida normal, um empate ou se teve goleada.
import java.util.Scanner;

public class PartidaDeFutebolUsandoCase {
    
    public static void main(String[] args) {
        int atletico,cruzeiro,diferencaDeGols;
        String status = "";

            System.out.println("-------------------------");
            System.out.println("   Atletico x Cruzeiro   ");
            System.out.println("-------------------------");
        Scanner entrada = new Scanner(System.in);
            System.out.print("Quantos gols fez o Atletico? ");
        atletico = entrada.nextInt(); // entrada do usuario
            System.out.print("Quantos gols fez o Cruzeiro? ");
        cruzeiro = entrada.nextInt(); // entrada do usuario
            System.out.println("-------------------------");
        diferencaDeGols = Math.abs(atletico-cruzeiro); // execulta a diferença e torna o numero negativo em positivo
            System.out.println("DIFERENÇA: " + diferencaDeGols + " gols");
            entrada.close();
            
        switch (diferencaDeGols) { // analiza o resultado entra () e retorna o caso correto.
            case 0:

                status = "STATUS: Empate";
                break;
            case 1:
                status = "STATUS: Partida normal";
                break;
            case 2:
                status = "STATUS: Partida normal";
                break;
            case 3:
                status = "STATUS: Partida normal";
                break;
            case 4:
                status = "STATUS: Goleada";
                break;
            case 5:
                status = "STATUS: Goleada";
                break;
            case 6:
                status = "STATUS: Goleada";
                break;
            case 7:
                status = "STATUS: Goleada ";
                break;
            case 8:
                status = "STATUS: Goleada ";
                break;
            case 9:
                status = "STATUS: Goleada ";
                break;
            default:
                System.out.println("STATUS: Ta de tiração com minha cara, mais de 10 gols de diferença?");
        }
                System.out.println(status);
                System.out.println("-------------------------");
    }
}