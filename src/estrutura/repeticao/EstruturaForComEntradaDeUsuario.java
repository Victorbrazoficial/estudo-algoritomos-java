package estrutura.repeticao;

import java.util.Scanner;

// Estrutura for "contagem regressiva" usando entrada do usuario
public class EstruturaForComEntradaDeUsuario {

    public static void main(String[] args)
    { 
        Scanner entrada = new Scanner(System.in);
            
            System.out.println("Digite um numero:");
        
        for (int usuario = entrada.nextInt(); usuario >= 0; usuario--)
        {
            System.out.println(usuario);
        }
    }    
}