package procedimento;

public class ParametroPorReferencia 
{
    public static void soma(int a, int b)
    {
        a += a;
        b += b;
        System.out.println(a+ " e " + b);
    }

    public static void main(String[] args) 
    {
        int x = 1;
        int y = 2;
        soma(x, y);   
        System.out.printf("%d %d", x, y);
    }
}