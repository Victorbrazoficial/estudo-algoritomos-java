package estrutura.condicional;

import java.util.Scanner;

public class CondicionalSimples {
    // CONDICIONAL SIMPLES
    public static void main(String[] args) {

        int numero;

    // ENTRADA DO USUARIO
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        entrada.close();

    // CONDICIONAL SIMPLES, POIS SÓ EXECULTA APENAS UMA CINDICIONAL.
                if (numero % 2 == 0) {
                    System.out.println(numero + " é par");
                }
    }
}