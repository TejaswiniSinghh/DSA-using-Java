import java.util.Scanner;
public class Vowels_Consonant 
{
    static boolean Check( char a)
    {
        char[] vowels = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
        for( int i=0; i<5; i++)
        {
            if( vowels[i] == a)
            {
                return true;
            }
        }
        return false;
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character to check: ");
        char a = sc.next().charAt(0);
        System.out.println(Check(a));
        sc.close();
    }

}
