package estrutura.repeticao;

import java.util.Scanner;

public class EstruturaForComEntradaDeUsuario {

    public static void main(String[] args) throws InterruptedException 
    { 
        Scanner entrada = new Scanner(System.in);
            
        System.out.println("Digite um numero:");
        
        for (int usuario = entrada.nextInt(); usuario >= 0; usuario--)
        {
            Thread.sleep(1000);
            System.out.println(usuario);
        }

    }
    
}