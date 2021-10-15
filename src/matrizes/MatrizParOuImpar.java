package matrizes;

import java.util.Scanner;

// Inserção de valores aleatorios na matriz e print apenas dos numeros pares.
public class MatrizParOuImpar 
{
    public static void main(String[] args) 
    {
        int matriz[][] = new int [3][3];
        int lin = 0;
        int col = 0;

        Scanner entrada = new Scanner(System.in);

        for (lin = 0; lin < matriz.length; lin++) // Contador de linha.
        {
            for (col = 0; col < matriz.length; col++) // contador de colunas.
            {
                System.out.println("Insira valor para matriz [" + lin + "][" + col + "]");
                matriz[lin][col] = entrada.nextInt(); // Entrada do usuario.        
            }  
        }
        
        System.out.println("**********************************");
        System.out.println("NUMEROS PARES DA MATRIZ");
        System.out.println("**********************************");
        
        for (lin = 0; lin < matriz.length; lin++)
        {
            for (col = 0; col < matriz.length; col++)
            {
                if (matriz[lin][col] % 2 == 0) // Condicional para printar os numeros pares da matriz.
                {   
                    System.out.println("{"+ matriz[lin][col]+"}");
                }
            }   
        }
    }
}