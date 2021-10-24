package matrizes;

import java.util.Scanner;

// Jogo da velha
public class JogoDaVelha 
{
    public static String jogoDaVelha[][] = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    public static String bolinhaOuX = ""; 
    public static int opcao = 0;
    public static int l = 0; 
    public static int c = 0; 
    public static int aux = 0; 
    public static Scanner entrada = new Scanner(System.in);

    // nove procedimentos com entrada do usuario, alteração da posição da matriz e formatação do texto/jogo da velha.
    public static void um()
    {
        bolinhaOuX = entrada.nextLine();
        jogoDaVelha[0][0] = bolinhaOuX;
        
        for (int l = 0; l < jogoDaVelha.length; l++)
        {
            for (int c = 0; c < jogoDaVelha.length; c++)
            {
                if (c == 1)
                {   
                    System.out.printf("  |%3s  |", jogoDaVelha[l][c]);
                }
                else
                {
                    System.out.printf("%3s", jogoDaVelha[l][c]);
                } 
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    public static void dois()
    {
        bolinhaOuX = entrada.nextLine();
        jogoDaVelha[0][1] = bolinhaOuX;
        
        for (int l = 0; l < jogoDaVelha.length; l++)
        {
            for (int c = 0; c < jogoDaVelha.length; c++)
            {
                if (c == 1)
                {   
                    System.out.printf("  |%3s  |", jogoDaVelha[l][c]);
                }
                else
                {
                    System.out.printf("%3s", jogoDaVelha[l][c]);
                } 
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    public static void tres()
    {
        bolinhaOuX = entrada.nextLine();
        jogoDaVelha[0][2] = bolinhaOuX;
        
        for (int l = 0; l < jogoDaVelha.length; l++)
        {
            for (int c = 0; c < jogoDaVelha.length; c++)
            {
                if (c == 1)
                {   
                    System.out.printf("  |%3s  |", jogoDaVelha[l][c]);
                }
                else
                {
                    System.out.printf("%3s", jogoDaVelha[l][c]);
                } 
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    public static void quatro()
    {
        bolinhaOuX = entrada.nextLine();
        jogoDaVelha[1][0] = bolinhaOuX;
        
        for (int l = 0; l < jogoDaVelha.length; l++)
        {
            for (int c = 0; c < jogoDaVelha.length; c++)
            {
                if (c == 1)
                {   
                    System.out.printf("  |%3s  |", jogoDaVelha[l][c]);
                }
                else
                {
                    System.out.printf("%3s", jogoDaVelha[l][c]);
                } 
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    public static void cinco()
    {
        bolinhaOuX = entrada.nextLine();
        jogoDaVelha[1][1] = bolinhaOuX;
        
        for (int l = 0; l < jogoDaVelha.length; l++)
        {
            for (int c = 0; c < jogoDaVelha.length; c++)
            {
                if (c == 1)
                {   
                    System.out.printf("  |%3s  |", jogoDaVelha[l][c]);
                }
                else
                {
                    System.out.printf("%3s", jogoDaVelha[l][c]);
                } 
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    public static void seis()
    {
        bolinhaOuX = entrada.nextLine();
        jogoDaVelha[1][2] = bolinhaOuX;
        
        for (int l = 0; l < jogoDaVelha.length; l++)
        {
            for (int c = 0; c < jogoDaVelha.length; c++)
            {
                if (c == 1)
                {   
                    System.out.printf("  |%3s  |", jogoDaVelha[l][c]);
                }
                else
                {
                    System.out.printf("%3s", jogoDaVelha[l][c]);
                } 
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    public static void sete()
    {
        bolinhaOuX = entrada.nextLine();
        jogoDaVelha[2][0] = bolinhaOuX;
        
        for (int l = 0; l < jogoDaVelha.length; l++)
        {
            for (int c = 0; c < jogoDaVelha.length; c++)
            {
                if (c == 1)
                {   
                    System.out.printf("  |%3s  |", jogoDaVelha[l][c]);
                }
                else
                {
                    System.out.printf("%3s", jogoDaVelha[l][c]);
                } 
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    public static void oito()
    {
        bolinhaOuX = entrada.nextLine();
        jogoDaVelha[2][1] = bolinhaOuX;
        
        for (int l = 0; l < jogoDaVelha.length; l++)
        {
            for (int c = 0; c < jogoDaVelha.length; c++)
            {
                if (c == 1)
                {   
                    System.out.printf("  |%3s  |", jogoDaVelha[l][c]);
                }
                else
                {
                    System.out.printf("%3s", jogoDaVelha[l][c]);
                } 
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    public static void nove()
    {   
        bolinhaOuX = entrada.nextLine();
        jogoDaVelha[2][2] = bolinhaOuX;
        
        for (int l = 0; l < jogoDaVelha.length; l++)
        {
            for (int c = 0; c < jogoDaVelha.length; c++)
            {
                if (c == 1)
                {   
                    System.out.printf("  |%3s  |", jogoDaVelha[l][c]);
                }
                else
                {
                    System.out.printf("%3s", jogoDaVelha[l][c]);
                } 
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    public static void menu() // procedimento Menu do jogo da velha
    {
        
        for (int l = 0; l < jogoDaVelha.length; l++)
        {
            for (int c = 0; c < jogoDaVelha.length; c++)
            {
                if (c == 1)
                {   
                    System.out.printf("  |%3s  |", jogoDaVelha[l][c]);
                }
                else
                {
                    System.out.printf("%3s", jogoDaVelha[l][c]);
                } 
            }
            System.out.println();
            System.out.println("-----------------");
        }

        do 
        {   
            do
            { // Só aceita numeros de 1 a 10. Enqunato não for inserido o comando se repete.
                System.out.println("escolha um numero disponivel:");
                opcao = entrada.nextInt();
            } while (opcao < 1 && opcao < 11);
            
            switch (opcao)
            {
                // OS case recebem entrada do usuario, procedimentos e a soma de aux + numero do case.
                case 1: System.out.println("Escolha 'o' ou 'x': ");
                        bolinhaOuX = entrada.nextLine();
                        um();
                        aux+=1;
                        break;

                case 2: System.out.println("Escolha 'o' ou 'x': ");
                        bolinhaOuX = entrada.nextLine();
                        dois();
                        aux+=2;
                        break;

                case 3: System.out.println("Escolha 'o' ou 'x': ");
                        bolinhaOuX = entrada.nextLine();
                        tres();
                        aux+=3;
                        break;
                
                case 4: System.out.println("Escolha 'o' ou 'x': ");
                        bolinhaOuX = entrada.nextLine();
                        quatro();
                        aux+=4;
                        break;
                
                case 5: System.out.println("Escolha 'o' ou 'x': ");
                        bolinhaOuX = entrada.nextLine();
                        cinco();
                        aux+=5;
                        break;

                case 6: System.out.println("Escolha 'o' ou 'x': ");
                        bolinhaOuX = entrada.nextLine();
                        seis();
                        aux+=6;
                        break;

                case 7: System.out.println("Escolha 'o' ou 'x': ");
                        bolinhaOuX = entrada.nextLine();
                        sete();
                        aux+=7;
                        break;

                case 8: System.out.println("Escolha 'o' ou 'x': ");
                        bolinhaOuX = entrada.nextLine();
                        oito();
                        aux+=8;
                        break;

                case 9: System.out.println("Escolha 'o' ou 'x': ");
                        bolinhaOuX = entrada.nextLine();
                        nove();
                        aux+=9;
                        break;
                
                case 10: System.out.println("fim");
                default:
            }

        } while (opcao != 10 && aux != 45); // repete case enqunato opção for diferente de 10 e aux diferente de 45
        System.out.println("jogo finalizado");
    }

        public static void main(String[] args) 
        {
          menu(); // procedimento menu.
        }
}
