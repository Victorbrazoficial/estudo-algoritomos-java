package procedimento;

import java.util.Scanner;

// Passem de parametro com retorno.
public class PassagemDeParametroComRetorno 
{
    public static Double n1, n2; // Variaveis globais.

    public static void entradaUsuario() // Entrada do usuário.
    {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:"); 
       n1 = entrada.nextDouble();
        System.out.println("Digite outro numero:"); 
       n2 = entrada.nextDouble();
    }

    public static Double soma(double a, double b) // Soma passando paramentro e trazendo retorno
    {
        double soma = a+b;
        System.out.println(soma);
        return soma;
    }

    public static void main(String[] args) 
    {
         entradaUsuario(); // Chamada entrada usuario.
         soma(n1, n2);  // chamada soma com parametro e retorno.
    }
}
