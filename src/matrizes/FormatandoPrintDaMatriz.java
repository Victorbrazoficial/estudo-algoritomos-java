package matrizes;

import java.util.Scanner;

// Formatando print em forma de tabela.
public class FormatandoPrintDaMatriz 
{
    public static void main(String[] args)
    {
        int matriz[][] = new int [4][4];
        int lin = 0;
        int col = 0;

        Scanner entrada = new Scanner(System.in);

        for (lin = 0; lin < matriz.length; lin++)
        {
            for (col = 0; col < matriz.length; col++)
            {
                System.out.println("Insira valor da matriz [" + lin +"]["+col+"]");
                matriz[lin][col] = entrada.nextInt();
            }
        }

        for (lin = 0; lin < matriz.length; lin++)
        {
            for (col = 0; col < matriz.length; col++)
            {
                System.out.printf(" %2d", matriz[lin][col]); // Cria o espaçamento de dois caracter na mesma linha
                
            }
            System.out.println(""); // Salta uma linha.
        }
    }
}