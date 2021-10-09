package vetores;

import java.util.Scanner;

// Estudo com vetores por meio de entrada do usuario, rotinas e condicionais
public class MediaEscolarUsandoVetores 
{
        public static float notas[] = new float[5]; // vetor com 5 posições.
        public static float media; // media do aluno
        public static String aluno; // nome do aluno
    
    // rotina para inserir o valor da entrada do usuario em cada posição do vetor.
    public static void entradaUsuario() 
    {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite seu nome:");
        aluno = entrada.next(); // Entrada do nome do aluno.
    
        // Contador para inserir a nota do aluno desde a posição 0 até a 4.
        for (int i = 0; i < notas.length; i++) 
        {
             System.out.println("Digite sua nota:");
        notas[i] = entrada.nextInt(); // entrada do usuario.
        }
            // Print do nome do aluno.
            System.out.println("Segue as notas do aluno(a) " + aluno + ":");
        
        // contador para print as notas que foram inseridas pelo aluno. 
        for (int i = 0; i < notas.length; i++)
        {
            System.out.println("nota: " + notas[i]);
        }
    }

    public static void calculoDaMedia() // rotina para caulcular a média das notas do aluno.
    { 
            media = (notas[0]+notas[1]+notas[2]+notas[3]+notas[4])/5;
            System.out.println("A média do aluno() " + aluno + " é de " + media);
    }
    // rotina que identifica se a nota do aluno ficou acima ou abaixo da media.
    public static void media() 
    {
        if (media < 6) // se a média for menor q 6 faça.
        {
            System.out.println(aluno + " sua nota está a baixo da média.");           
        }
        else
            {
                if (media >= 6) // se a media for maior ou igual a 6 faça.
                {
                    System.out.println(aluno + " sua nota está acima da média.");
                }
            }
    }

    public static void main(String[] args) 
    {
        entradaUsuario();
        calculoDaMedia();
        media();
    }
}