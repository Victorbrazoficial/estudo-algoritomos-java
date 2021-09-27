package estrutura.condicional;

import java.util.Scanner;

// É CHAMADA DE COMPOSTA POIS EXECULTA MAIS DE UMA CONDICIONAL
public class CondicionalComposta {

    public static void main(String[] args) {

        int numero;

        // ENTRADA DO USUARIO
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        entrada.close();

        // SE RESTO DE "numero" DIVIDIDO POR 2 FOR 0, "numero" É PAR SE NÃO "numero" É IMPAR

        // "SE" RESTO DE "numero" FOR IGUAL A 0 "numero" É PAR (RESTO DE numero É IGUAL A 0)
        if (numero % 2 == 0) {
            System.out.println(numero +" é par.");
        }
        // "SE NÃO" "numero" É IMPAR (SE RESTO DE "numero" É DIFERENTE DE 0 "numero" É IMPAR)
        else {
            System.out.println(numero + " é impar.");
        }
    }
}