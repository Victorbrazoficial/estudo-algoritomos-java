package estrutura.repeticao;

import java.util.Scanner;

// Soma com estrutura de repetição e retorno de informção sobre qual foi maior numero inserido pelo usuario
public class SomaComEstruturaDeRepeticao {
    
    public static void main(String[] args) {
        int contador,numero,soma,maiorNumeroInserido;
        contador = 1;
        soma = 0;
        maiorNumeroInserido = 0;

        // Estrutura de repetição com soma.
       while (contador<=5) { //a estrutura vai somar enquanto contador for menor ou igual a 5.
           Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o " + contador + "º numero:");
           numero = entrada.nextInt(); // Entrada do usuario

           // Função abaixo compara qual foi o maior numero inserido pelo usuario
           if (numero>maiorNumeroInserido){  // Se valor de "numero" for maior que valor de "maiorNumeroInserido"
               maiorNumeroInserido = numero; // "maiorNumeroInserido" recebe valor de "numero".
           }
           soma += (numero); // Soma = soma+numero;
           contador++; // altera o valor do contador somando +1
       }
            System.out.println("Soma de todos os numeros inseridos: " + soma);
            System.out.println("Esse foi o maior numero digitado:"+maiorNumeroInserido);
    }
}