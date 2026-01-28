import java.util.*;
public class Remove_Duplicates 
{

    static int removeElement(int[] nums, int val) 
    {
        int k=0;
        for(int i=0; i<nums.length ; i++)
        {
            if(nums[i]!=val)
            {
                nums[k]=nums[i];
                k++;
            }
        } 
        return k;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Size of array:");
        int size= sc.nextInt();
        int[] nums= new int[size];
        for(int i=0; i< size; i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter value to be checked and removed:");
        int val= sc.nextInt(); 
        int k= removeElement(nums,val);
        for(int i=0; i< k; i++)
        {
            System.out.print(nums[i] +" " );
        }
    }

}
