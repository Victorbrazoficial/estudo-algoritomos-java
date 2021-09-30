package procedimento;

// Estrutura de um procedimento simples.
public class ProcedimentoSoma {

    static void soma( int a, int b ) // Estrutura do procedimento.
    {            
        int somaProcedimento = a+b;
        System.out.println("|Resultado do procedimento soma(a+b)| -> " + somaProcedimento);    
        System.out.println("---------------------------------------------------<");    
    }
    
    public static void main(String[] args) 
    {
        // Procedimento com valores inseridos.
        soma(1,2); // Posso repetir varias vezes usando só o procedimento soma()."
        soma(3,4); // A quantidade de codigo reduz.
        soma(5,6); 
        soma(7,8);
    }
    
}