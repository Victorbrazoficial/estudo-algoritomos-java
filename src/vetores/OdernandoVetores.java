package vetores;

import java.util.Scanner;

// Organizando os as posiçoes do vetor em ordem crescente.
public class OdernandoVetores 
{
    public static void main(String[] args) 
    {
        int[] vetor = new int [5]; // vetor com 5 pisições de "0 a 4"
        int i = 0; // valor do primeiro index 
        int j = 0; // valor do segundo index
        int aux = 0; // auxiliar na troca dos valores

        for (i = 0; i <= 4; i++) // contador para inserir 5 entradas, cada uma em uma posição diferente de "0 a 4"
        {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um numero");
        vetor[i] = entrada.nextInt(); // entradas do usuario.
        }

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("VALORES INSERIDOS FORA DE ORDEM");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (i = 0; i <= 4; i++) // contador simples para repetir o print em cada posição do vetor[i] da posição 0 ate 4.
        {              
            System.out.println(vetor[i]);
        }
        
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("VALORES CORRIGIDOS EM ORDEM");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (i = 0; i <= 4; i++) // contador das posições do vetor["i"]
        {
           for (j = i+1; j <= 4; j++) // contador das posiçoes do vetor["j"]
           {
                if (vetor[i] > vetor[j]) // vetor[i] for maior que vetor[j] faça: \/
                {
                    aux      = vetor[i]; // valor de auxiliar passa a ser valor de vetor[i]
                    vetor[i] = vetor[j]; // valor de vetor[i] passa a ser valor de vetor[j]
                    vetor[j] = aux;      // valor de vetor[j] passa a ser valor de auxiliar
                }
            }
        }
        for (i = 0; i <= 4; i++) // contador simples para print os valores das posições do vetor[i]
        {              
            System.out.println(vetor[i]);
        }
    }
}