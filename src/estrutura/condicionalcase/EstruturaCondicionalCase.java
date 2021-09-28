package estrutura.condicionalcase;

import java.util.Scanner;

// Doação Criança Esperança. Codigo com sugestoes de valores a serem doados.
public class EstruturaCondicionalCase {

    public static void main(String[] args) {
        int usuario;
        float valor = 0;

        Scanner entrada = new Scanner(System.in); // Pedido de Entrada do usuario
            System.out.println("---------------------------");
            System.out.println("Escolha sua opção de doação.");
            System.out.println("---------------------------");
            System.out.println("[1] - para dorar R$ 10");
            System.out.println("[2] - para dorar R$ 20");
            System.out.println("[3] - para dorar R$ 30");
            System.out.println("[4] - para dorar R$ 40");
            System.out.println("[5] - para cancelar");
            usuario = entrada.nextInt(); // Entrada do usuario
            entrada.close();

            switch (usuario) { // condicional switch/case (o valor inserido sera avaliado retornando a condicional correta)
                case  1 :
                    valor = 10;
                    break; // finaliza a condicional caso ela seja a correta.

                case 2 :
                    valor = 20;
                    break;
                case 3 :
                    valor = 30;
                    break;
                case 4 :
                    valor = 40;
                    break;
                case 5: //
                    System.out.println("Cancelado com sucesso!");
                    break;
                default: // se o usuario digitar algum numero diferente dos case ele retornar a messagem e encerra a condicional
                    System.out.println("você precisa escolher uma das opções de 1 a 5. Inicie o programa novamente.");

            }
        // se a entrada do usuario for menor que 5 e diferente de 0 sera execultado oq esta no bloco
            if ((usuario<5) && (usuario!=0)){
        System.out.println("|----------------------------------------|");
        System.out.println("|Origado por ter cooperado com sua doação|");
        System.out.println("|----------------------------------------|");
        System.out.println("|          SUA DOAÇÃO FOI DE:            |");
        System.out.println("|----------------------------------------|");
        System.out.printf("|              R$ %.2f                  |",valor);
            }
    }
}