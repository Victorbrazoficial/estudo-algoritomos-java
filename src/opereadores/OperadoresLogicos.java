package opereadores;

import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {

        // ESTUDO A PARTIR DAS ENTRADAS "A=1" E "B=2"
        int a,b;
        boolean eTrue,eFalse,ouTrue,ou2True,ou3False,naoTrue,naoFalse;

        // ENTRADA DO USUARIO
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        a = entrada.nextInt();
        System.out.println("Digite um numero:");
        b = entrada.nextInt();
        entrada.close();

        // OPERADOR LOGICO E(&&)
        // COMPARA SE "A" É MENOR QUE "B" E SE "B" É MAIOR QUE "A".
        // *O RESULTADO DOS DOIS OPERADORES RELACIONAIS PRECISAM RETORNA "VERDADEIRO" PARA SER TRUE.
        eTrue    = (a<b && b>a);

        // OPERADOR LOGICO E(&&)
        // COMPARA SE "A" É MENOR QUE "B" E SE "B" É MAIOR QUE "A".
        // O RESULTADO DE UM DOS OPERADORES RELACIONAIS É "FALSO", POR ISSO  RETORNAR "FALSE"
        eFalse   = (a<b && a>b);

        // OPERADOR LOGICO OU (||)
        // COMPARA SE A É MENOR QUE B "OU" SE B É MAIOR QUE A
        // *PRA QUE SEJA "TRUE" UM OU O OUTRO, OU ATE MESMO OS DOIS RESULTADOS PRECISAM RETORNAR VERDADEIRO NO SEU RESULTADO
        // *PELO MENOS UM PRECISA SER VERDADEIRO PARA SER "TRUE"
        // NESSE CASO "A" É MENOR QUE "B" OU "B" É MENOR QUE "A"? SIM! NESSE CASO OS DOIS SÃO "VERDADEIROS" RETORANDO "TRUE"
        ouTrue   = (a<b || b>a);

        // OPERADOR LOGICO OU (||)
        // *PELO MENOS UM PRECISA SER VERDADEIRO PARA SER "TRUE"
        // NESSE CASO "A" É MENOR QUE "B" RETORNANDO "TRUE"
        ou2True  = (a<b || a>b);

        // OPERADOR LOGICO OU (||)
        // *PELO MENOS UM PRECISA SER VERDADEIRO PARA SER "TRUE"
        // NESSE CASO A NÃO É MAIOR QUE B E NEM B É MENOR QUE A.
        // NENHUM DOS DOIS OPERADORES RELACIONAIS RETORNA "TRUE" POR ISSO O RESULTADO É "FALSE"
        ou3False = (a>b || b<a);

        // OPERADOR LOGICO NÃO(!)
        // O OPERADOR "NÃO" INVERTE O RESULTADO FINAL.
        // SE O RESULTADO FINAL DOS OPERADORES RELACIONAIS FOIR TRUE, MAS TIVER O "!" NA FRENTE ELE RETONAR "FALSE"
        // NESSE CASO, A NÃO É MAIOR QUE B, MAS O OPERADOR LOGICO "!" INVERTE DO RESULTADO FINAL, PASSANDO DE "FALSE" PARA "TRUE"
        naoTrue  = (!(a>b));

        // OPERADOR LOGICO NÃO(!)
        // O OPERADOR "NÃO" INVERTE O RESULTADO FINAL.
        // SE O RESULTADO FINAL DOS OPERADORES RELACIONAIS FOIR TRUE, MAS TIVER O "!" NA FRENTE ELE RETONAR "FALSE"
        // NESSE CASO A É MENOR QUE B, MAS O OPERADOR LOGICO "!" INVERTE O RESULTADO FINAL, PASSANDO DE "TRUE" PARA "FALSE"
        naoFalse = (!(a<b));

        // PRINT NA TELA
        System.out.println(a +" é menor que " + b + " e " + b + " é maior que " + a + "?\n" + eTrue +
                "\n"+ a +" é menor que " + b + " e " + a + " é maior que " + b + "?\n" + eFalse +
                "\n"+ a +" é menor que " + b + " ou " + b + " é maior que " + a + "?\n" + ouTrue +
                "\n"+ a +" é menor que " + b + " ou " + a + " é maior que " + b + "?\n" + ou2True +
                "\n"+ a +" é maior que " + b + " ou " + b + " é menor que " + a + "?\n" + ou3False +
                "\n"+ "Retorne true se for false: " + a +" é maior que " + b + "?\n" + naoTrue +
                "\n"+ "Retorne false se for true: " + a +" é menor que " + b + "?\n" + naoFalse);
    }   
}