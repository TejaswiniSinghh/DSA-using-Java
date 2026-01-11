import java.util.*;
public class Print_matrix 
{
    static void printing(int[][] mat)
    {
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int[][] mat= new int[2][2];
        for(int i=0; i<2;i++)
        {
            for(int j=0; j<2;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        printing( mat);
    }
    
}
