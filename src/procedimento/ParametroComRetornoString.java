package procedimento;

// Passagem de parametro com retorno tipo String
public class ParametroComRetornoString 
{
    public static String contador( int i, int f) // Rotina contador.
    {
       String string = "";

       for (int c = i; c <= f; c++) 
       { 
           string = string + c + " ";     
       }
        return string; // Retorno.
    }   

    public static void main(String[] args) 
    {
        System.out.println(contador(1,20)); // Chamando contador dentro do print.
    }
}