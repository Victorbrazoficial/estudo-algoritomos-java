package estrutura.repeticao;

// Estrutra de repetição e potenciação em sequencia, de 1 a 5 usando base 2.

public class PotenciaCriadaComRepeticaoFor {

    public static void main(String[] args) {

        int base, potencia = 1; // varaiveis fora do "for" para armazenar o valor atualizado dentro do bloco 

            System.out.println("|POTENCIAÇÃO|");

        for (int expoente = 1; expoente <= 5; expoente++) { // estrutura de repetição, enquanto expoente for menor ou igual a 5 some +1
     
                base = 2; 
                potencia = base*potencia; // função da potencia: ela mesma vezes base.
    
            System.out.println("------------------------------------------------------");
            System.out.println("Base " + base + " elevado ao " + "Expoente: " + expoente);
            System.out.println("Valor da potencia: " + potencia);
       
        }   
    }  
}