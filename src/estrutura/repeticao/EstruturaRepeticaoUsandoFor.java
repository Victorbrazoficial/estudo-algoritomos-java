package estrutura.repeticao;

// Estrutura simples usando dois "for" contador e contagem regressiva.
public class EstruturaRepeticaoUsandoFor {

    public static void main(String[] args) {
        
        int contador = 0;
           
            System.out.println("Contador:");

        for  (contador = 1; contador <= 10 ; contador++) { // "for" que adiciona +1 enquanto contador tiver valor menor ou igual a 10
            System.out.println(contador); // Contador foi até 11. como 11 é maior que 10 ele não passou, porem foi adicionado +1 no contador.

        }
            System.out.println("------------------------------------------------------");
            System.out.println("Contador terminou com: " + contador); // Print do valor final do Contador. 
            System.out.println("------------------------------------------------------");

            System.out.println("Contagem regressiva:"); 

        for (; contador > 0; contador--) {  // "for" inverso. Subtrai -1 do contador final enquanto contador for maior que 0.
            System.out.println(contador);  
       
        }             
    }      
}