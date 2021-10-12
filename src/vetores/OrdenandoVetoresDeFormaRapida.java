package vetores;

import java.util.Arrays;
import java.util.Scanner;

// Ordenando vetores com metodos.
public class OrdenandoVetoresDeFormaRapida 
{
    public static void main(String[] args) 
    {       
        int vetor[] = new int[5];   
        
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite 5 numeros:");
        for (int i = 0; i < vetor.length; i++) // contador de posições do indice para entrada do usuario.
        {
            vetor[i] = entrada.nextInt(); // entrada do usuario de acordo com a posição do contador.
        }

        System.out.println("Valor das entradas do usuario fora de ordem:" );
        for ( int entradas : vetor) // percorrendo o vetor usando menos codigo.
        {
            System.out.println(entradas); // print do vetor
        }

        System.out.println("Valor das entradas ordenadas:" );
        Arrays.sort(vetor); // Metodo que ordena o vetor.
        for ( int ordenar : vetor) // percorrendo o vetor que foi ordenado.
        {
            System.out.println(ordenar);
        }

    }
}