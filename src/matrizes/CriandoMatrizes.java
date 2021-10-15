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
           for (coluna = 0; coluna <= 1; coluna++) // contador das colunas
           {                        
                System.out.println("Insira um numero para matriz [" + linha + "][" + coluna + "]");
            matriz[linha][coluna] = entrada.nextInt(); // Entrada do usuario.             
           }                  
        }
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("VALORES INSERIDOS PELO USUARIO");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        for (int l = 0; l < matriz.length; l++)
        {
            for (int c = 0; c <=1; c++)
            {
                System.out.println("matriz[" + l + "][" + c + "] = " + matriz[l][c]);               
            }
                System.out.println("");
        }

        System.out.println("---------------------------------------");
        System.out.println("BUSCA DE TODAS AS POSIÇÕES DA COLUNA 0");
        System.out.println("---------------------------------------");
        
        for (int i = 0; i <= 3; i++)
        {
            System.out.println("" + matriz[i][0]);
        }
    }
}
