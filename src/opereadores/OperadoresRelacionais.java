package opereadores;

import java.util.Scanner;

// TODO OPERADOR RELACIONAL RETORNA UM RESULTADO LOGICO (TRUE OU FALSE)
public class OperadoresRelacionais {

    public static void main(String[] args) {
        int a,b;

        boolean menor,menorIgual,maiorIgual,maior,igual,diferente;

        // SCANNER É A ENTRADA DO USUARIO, PARA CRIAR A ENTRADA É NECESSARIO USAR AS DUAS FUNÇOES:
        //Scanner variavel = new Scanner(System.in); E  outraVariavel = leia.nextInt();
             Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
             a = entrada.nextInt();
        System.out.println("Digite um numero");
             b = entrada.nextInt();

        // DENTRO DOS PARENTESES ESTÃO OS OPERADORES RELACIONAIS
        menor      = (a<b);
        menorIgual = (a<=b);
        maior      = (a>b);
        maiorIgual = (a>=b);
        igual      = (a==b);
        diferente  = (a!=b);

        // IMPRESSÃO DAS VARIAVEIS LOGICAS
        System.out.println(a +" é menor que " + b + "?\n" + menor +
                     "\n"+ a +" é menor ou igual a " + b + "?\n" + menorIgual +
                     "\n"+ a +" é maior que " + b + "?\n" + maior +
                     "\n"+ a +" é maior ou igual a " + b + "?\n" + maiorIgual +
                     "\n"+ a +" é igual a " + b + "?\n" + igual +
                     "\n"+ a +" é diferente de " + b + "?\n" + diferente);
    }
}