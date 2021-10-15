package matrizes;

import java.util.Scanner;

public class MatrizIdentidade 
{
    
    public static void main(String[] args) 
    {
        
        int matriz[][] = new int[4][4];
        int lin = 0;
        int col = 0;
        
        
        for (lin = 0 ; lin < matriz.length; lin++)
        {
            for (col = 0; col < matriz.length; col++) 
            {
               if (lin == col)
               {
                   matriz[lin][col] = 1;
               }
               else 
               {
                   matriz[lin][col] = 0;
               }
                
            }  
        } 
        
        for (lin = 0 ; lin < matriz.length; lin++)
        {
            for (col = 0; col < matriz.length; col++) 
            {
          
                
                {
                    System.out.printf("%2d ", matriz[lin][col]);
                }
                
                
            } 
            System.out.println("");
        } 
    }
}