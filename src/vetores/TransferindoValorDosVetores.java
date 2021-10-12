package vetores;

import java.util.Scanner;

// Tranferencia de valor com vetor de duas posições.
public class TransferindoValorDosVetores
{
    public static void main(String[] args) 
    {
        String vetor[] = new String[2];
        String auxiliar = "";

        Scanner entrada = new Scanner(System.in); 
            System.out.println("Digite dois nome diferentes:");
        
            for (int i = 0; i < vetor.length; i++) // contador do indice para ir alterando a posição da entrada do usuario.
         {
             vetor[i] = entrada.nextLine(); // entrada do usuario.
         }    
        
            System.out.println("Entrada do usuario: " + vetor[0] +" e " + vetor[1]);
         
         auxiliar = vetor[0];
         vetor[0] = vetor [1];
         vetor[1] = auxiliar;
            System.out.println("Resultado depois da tranferencia de valores: " + vetor[0] +" e " + vetor[1]);
    }
}