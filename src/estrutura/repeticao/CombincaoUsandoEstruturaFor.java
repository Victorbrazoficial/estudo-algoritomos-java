package estrutura.repeticao;

// Cobinção de numeros usando estrutura "for aninhada"
public class CombincaoUsandoEstruturaFor {

    public static void main(String[] args)
    {
        int contador1, contador2, contador3, contador4, contador5;

        for (contador1 = 1; contador1 <= 5; contador1++) // Primeiro for.
        {     
            
            for (contador2 = 1; contador2 <= 5 ; contador2++) // Segundo for.

            { 

            for (contador3 = 1; contador3 <= 5; contador3++) // terceiro for.

            {   

            for (contador4 = 1; contador4 <= 5; contador4++) // quarto for.

            {

            for (contador5 = 1; contador5 <4; contador5++) // Quinto for.

            {  // Print dentro do bloco do quinto(ultimo) for.
                System.out.printf("%d %d %d %d %d \n", contador1, contador2, contador3, contador4, contador5);        
            }
            }
            }
            }
        }
    }   
}