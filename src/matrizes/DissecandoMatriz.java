package matrizes;

import java.util.Scanner;

// Separando a matriz em partes em quatro partes.
public class DissecandoMatriz 
{
    public static int matriz[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    public static int l;
    public static int c;
    public static int opcao;
    public static Scanner entrada = new Scanner(System.in);
    
        public static void main(String[] args) 
        {
            menu();
        }
    
        public static void MostrarMatriz() // Matriz inteira
        {
                System.out.println("-----------------------------");
                System.out.println("Matriz");

            for (int l = 0; l < matriz.length; l++)
            {
                for ( int c = 0; c < matriz.length; c++)
                {
                    System.out.printf("%3s ", matriz[l][c]);
                }
                    System.out.println();
            }
                System.out.println();
        }
        public static void diagonalPrincipal() // Diagonal principal
        {  
                System.out.println("-----------------------------");
                System.out.println("Diagonal Principal");
                
            for (int l = 0; l < matriz.length; l++)
            {
                System.out.println(matriz[l][l]);
                for (int t = 0; t <= l; t++)
                {
                    System.out.print("   ");
                }
            }
                System.out.println();     
        }

        public static void trianguloInferior() // Triangulo inferior
        {
                System.out.println("-----------------------------");
                System.out.println("Triangulo Inferior");

            for (int l = 1; l < matriz.length; l++)
            {
                System.out.println();
                for ( int c = 0; c <= l-1; c++)
                {
                    System.out.printf("%3s ", matriz[l][c]);
                }     
            }
                System.out.println();
                System.out.println();
        }
        
        public static void trianguloSuperior() // Triangulo superior
        {   
                System.out.println("-----------------------------");
                System.out.println("Triangulo Superior");
            
            for (int l = 0; l < matriz.length; l++)
            {
                System.out.print("  ");
                for ( int c = l+1; c < matriz.length; c++)
                {
                    System.out.printf("%3s ", matriz[l][c]);
                }
                    System.out.println();
                for (int i = 0; i <= l; i++) 
                {     
                    System.out.print("    ");
                }
            }
                System.out.println();
        }
          
        public static void menu() // Menu
        {       
            do
            {   
                System.out.println("MENU OPÇÕES");
                System.out.println("==========================");
                System.out.println("[1] Mostrar a Matriz");
                System.out.println("[2] Diagonal Principal");
                System.out.println("[3] Triangulo Superio");
                System.out.println("[4] Triangulo Inferior");
                System.out.println("[5] Sair");
                
                do // so aceita nuemors entre 1 a 5
                {
                    System.out.println("==== ESCOLHA SUA OPÇÂO:");
                    opcao = entrada.nextInt();
                } while ((opcao < 1) && (opcao > 5));
            
                switch (opcao)
                {
                    case 1 :        
                    MostrarMatriz();           
                    break;
                    
                    case 2:                
                    diagonalPrincipal();            
                    break;
                
                    case 3:                  
                    trianguloSuperior();            
                    break;
                    
                    case 4:               
                    trianguloInferior();
                    break;
    
                    case 5 :                  
                    System.out.println("-----------------------------");
                    System.out.println("Processo encerrado.");
                    System.out.println("-----------------------------");
                    break;
                }    
            } while (opcao != 5);     
        }
}