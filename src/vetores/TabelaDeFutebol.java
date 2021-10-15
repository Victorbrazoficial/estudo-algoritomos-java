package vetores;

// Tabelinha combinações de jogo usando vetor. (o mesmo time não pode jogar contra ele mesmo)
public class TabelaDeFutebol 
{
    public static void main(String[] args) 
    {
        String time[] = {"atletico", "cruzeiro", "america"};
                           
            System.out.printf( "%s x %s \n" , time[0] , time[1]);
            System.out.printf( "%s x %s \n" , time[0] , time[2]);
            System.out.printf( "%s x %s \n" , time[1] , time[0]);
            System.out.printf( "%s x %s \n" , time[1] , time[2]);
            System.out.printf( "%s x %s \n" , time[2] , time[0]);
            System.out.printf( "%s x %s \n" , time[2] , time[1]);                     
        
    }
}