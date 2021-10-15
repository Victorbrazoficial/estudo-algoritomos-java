package matrizes;

import java.util.Scanner;

// Criando e inserindo dados na matriz.
public class CriandoMatrizes 
{
    public static void main(String[] args) 
    {
        int matriz[][] = new int[4][2];
        int linha = 0, coluna = 0;

        Scanner entrada = new Scanner(System.in);
        
        for (linha = 0; linha <= 3; linha++) // Contador das linhas    
        {         
            System.out.println("Insira os valores da LINHA " + linha);
            
        for (coluna = 0; coluna <= 1; coluna++) // contador das colunas
        {            
            matriz[linha][coluna] = entrada.nextInt(); // Entrada do usuario.        
            System.out.println("entrada LINHA " + linha + " COLUNA " + coluna + " = " + matriz[linha][coluna]);
        }                  
        }
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("VALORES INSERIDOS PELO USUARIO");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("matriz[0][0] = "+matriz[0][0]);
        System.out.println("matriz[0][1] = "+matriz[0][1]);
        System.out.println("matriz[1][0] = "+matriz[1][0]);
        System.out.println("matriz[1][1] = "+matriz[1][1]); 
        System.out.println("matriz[2][0] = "+matriz[2][0]);
        System.out.println("matriz[2][1] = "+matriz[2][1]);
        System.out.println("matriz[3][0] = "+matriz[3][0]);
        System.out.println("matriz[3][1] = "+matriz[3][1]); 

        System.out.println("---------------------------------------");
        System.out.println("BUSCA DE TODAS AS POSIÇÕES DA COLUNA 0");
        System.out.println("---------------------------------------");
        
        for (int i = 0; i <= 3; i++)
        {
            System.out.println("" + matriz[i][0]);
        }
    }
}