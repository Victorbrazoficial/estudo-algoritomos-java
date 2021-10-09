package vetores;

// Estudo sobre criação/percorrer vetores.
public class PrimeirosPassosComVetores 
{   
    // Criação de vetor, já sabendo quais numeros serão incluidos em cada posição.
    public static int vetor[] = {8,6,4,2}; 

    public static void primeiraFormaDePercorrerVetor()
    {   
         // Contador normal de 0 a 3 (4 posições) , somando de 1 em 1, usando variavel "c".
        for (int c = 0; c <= 3; c++) 
        {   
            // Print do valor de vetor[] na posição ["c"]. (vai percorrer de 0 a 4)
            System.out.println("Na posição " + c + " Temos o valor " + vetor[c]);
        }
    }

    public static void comprimentoDoVetorUsandoLength()
    { 
        // length conta quantas posiçoes exite dentro do meu vetor.
        System.out.println("Total de posições dentro do 'vetor[]' = " + vetor.length);
    }

    public static void percorrendoVetorComLength()
    {
        // Contador usando vetor.length-1 (4 posições), somando de 1 em 1, usando variavel "c".
        for (int c = 0; c <= vetor.length-1; c++)
        {    
            // Print do valor de vetor[] na posição ["c"]. (vai percorrer de 0 a 4)
            System.out.println("Na posição " + c + " Temos o valor " + vetor[c]);
        }
    }
    public static void main(String[] args) 
    {
            System.out.println("---------------------------------<"); 
            System.out.println("Percorrendo vetor com 'c <= 3'");
            System.out.println("---------------------------------<"); 
        primeiraFormaDePercorrerVetor(); 
            
             System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<"); 
        comprimentoDoVetorUsandoLength();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<");

            System.out.println("----------------------------------<");  
            System.out.println("Percorrendo o vetor usando 'length-1'");
            System.out.println("----------------------------------<"); 
        percorrendoVetorComLength();
    }
}