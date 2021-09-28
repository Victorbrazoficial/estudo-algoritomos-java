package estrutura.repeticao;

import java.util.Scanner;

// Estrutura de repetiçao simples. Que conta de 0 ate o numero que o usuario solicitar.
public class RepeticaoEnquantoFaca {

    public static void main(String[] args) {
        int teste = 0;
        int usuario;
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite ate que numero voce deseja contar:");
        usuario = entrada.nextInt();
        while (teste<=usuario) { // repete ate que valor de teste continue menor ou igual a valor de usuario.
            System.out.println(teste);
            teste++; // Soma +1 no valor da variavel
        }
    }    
}