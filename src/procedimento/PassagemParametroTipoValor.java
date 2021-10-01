package procedimento;

import java.util.Scanner;

// Rotina e passagem de Parametro do tipo "valor"
public class PassagemParametroTipoValor 
{
    public static int dividendo, divisor, quociente; // Variaveis globais.

    public static void entradaUsuario() // Rotina de entrada do usuario
    {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o numero do dividendo: ");
        dividendo = entrada.nextInt();
            System.out.println("Digite o numero do divisor: ");
        divisor = entrada.nextInt();
    }
    
    
    public static void divisao( int a, int b) // Procedimento com passagem de parametro divisao(a,b).
    {
        quociente = (a/b); // Quociente = Resultado da divisião.
            System.out.println("A divisão de " + dividendo + " por " + divisor + " é " + quociente);
    }

    public static void main(String[] args) // Execução dos procedimentos.
    {
        entradaUsuario(); 
        divisao(dividendo,divisor); // Os valores dos paremetros dependem da entrada do usuario.
    }   
}