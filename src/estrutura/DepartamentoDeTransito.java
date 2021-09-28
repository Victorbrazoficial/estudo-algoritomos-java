package estrutura;

// Estrutura condicional que consulta se a pessoar já é maior de idade e pode tirar carteira
import java.util.Scanner;

public class DepartamentoDeTransito {

    public static void main(String[] args) {

        int ano, nasc, resultado;

        // Entrada do usuario
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite os dados abaixo para conferir se estar apto a tirar carteira.\nDigite o ano que estamos: ");
        ano = entrada.nextInt();
            System.out.println("digite sua data de nascimento: ");
        nasc = entrada.nextInt();
        
        entrada.close();

        // função que faz a subtração do ano atual "-" o ano de nascimento do usuario
        resultado = (ano-nasc);

        // Estrutura Condicional
        if (resultado <= 18) {
            System.out.println("você ainda não pode tirar carteira de motorista.");
        }
        else {
            System.out.println("Você já esta autorizado a tirar carteira de motorista.");
        }
    }
}