package estrutura.condicionalaninhado;

// Condicional Aninhada
import java.util.Scanner;

// Codigo medidor de IMC (Índice de Massa Corporal)

public class CondicionalAninhada {

    public static void main(String[] args) {
        double massa,altura,imc;

        // Entrada do usuario
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite sua altura: ");
        altura = entrada.nextDouble();
            System.out.println("Digite seu peso: ");
        massa = entrada.nextDouble();
        imc = (massa/Math.pow(altura,2));
            System.out.printf(" IMC: %.2f " ,imc);
        entrada.close();

        if (imc<17){ // Condicional 1
            System.out.println("\nIMC: muito abaixo do peso.");
        }
        else{
            if ((imc>=17) && (imc<18.5)) { // Condicional 2
                System.out.println("\nIMC: abaixo do peso.");
            }
            else
                {if ((imc>=18.5) && (imc<25)) { // Condicional 3
                    System.out.println("\nIMC: peso ideal.");
                }
                else
                    {if ((imc>=25) && (imc<30)){ // Condicional 4
                    System.out.println("\nIMC: acima do peso.");
                    }
                    else
                        {if ((imc>=30) && (imc<35)) { // Condicional 5
                             System.out.println("\nIMC: Obesidade.");
                        }
                        else
                            {if ((imc>=35) && (imc<40)){ // Condicional 6
                                System.out.println("\nIMC: Obesidade severa.");
                            }
                            else
                                {if (imc>=40) { // Condicional 7
                                    System.out.println("\nIMC: Obesidade morbida.");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }    