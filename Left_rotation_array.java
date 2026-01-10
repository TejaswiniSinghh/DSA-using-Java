import java.util.*;
public class Left_rotation_array 
{
    static int[] rotations(int[] array, int d)
    {

        int temp;
        for(int i=0; i<d; i++)
        {
            d=d%array.length;
            temp=array[0];
            for(int j=0;j<array.length; j++)
            {
                if(j==4)
                {
                    array[j]=array[j];
                }
                array[j]=array[j+1];
            }
            array[array.length-1]=temp;
        }
        return array;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int d= sc.nextInt();
        int[] array= new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int[] result=rotations(array, d );
        for(int x: result)
        {
            System.out.print( x+" ");
        }    
        
        sc.close();
    }
}
