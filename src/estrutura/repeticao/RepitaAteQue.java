package estrutura.repeticao;

import java.util.Scanner;

// Repete a Consulta se o numero de entrada do usuario é par ou impar até que contador seja menor que 5
public class RepitaAteQue {

    public static void main(String[] args) {

        int contador = 0;
        int parOuImpar;

        do { Scanner entrada = new Scanner(System.in);
            System.out.println("Digite 5 numeros: ");
            parOuImpar = entrada.nextInt(); // Entrada do usuario
            
            contador++;

            if (parOuImpar % 2 == 0) { System.out.println(parOuImpar + " é par."); // se 
            }

            else { System.out.println(parOuImpar + " é Impair."); // se não
            }

        }
        while (contador<5); // ate que contador seja menor que 5
    }    
}