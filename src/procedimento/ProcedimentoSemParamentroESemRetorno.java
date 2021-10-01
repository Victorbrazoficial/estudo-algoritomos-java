package procedimento;

import java.util.Scanner;

// Rotina sem passagem de paramentro e sem retorno.
public class ProcedimentoSemParamentroESemRetorno 
{
    public static int numeroUsuario; // Variavel Global
    
    public static void entradaUsuario() // Procedimento entrada do usuario.
    {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um numero: ");
        numeroUsuario = entrada.nextInt();
            System.out.println("numero é: " + numeroUsuario);
    }    

    public static void ParOuImpar() // Procedimento compara Par ou impar depois da entrada do usuario.
    {
        entradaUsuario(); // Procedimento entrada do usuario.

        if (numeroUsuario % 2 == 0) // Se resto for igual a 0, printa "PAR"
        {
            System.out.println("O numero " + numeroUsuario + " é PAR.");
        }
        else // Se não for igual a zero o resto, printa Impar.
        {
            System.out.println("O numero " + numeroUsuario + " é IMPAR.");
        }
    }

    public static void main(String[] args) 
    {
        ParOuImpar(); // Inclui os dois procedimento: entradaUsuario() e parouImpar().
    }
}
    
