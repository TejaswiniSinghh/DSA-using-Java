import java.util.*;
public class Queue_Dynamic_input 
{
    public static void main(String[] args)
    {
        Queue<String> students = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter " +(i+1)+ "th Student name:");
            String name= sc.nextLine();
            students.offer(name);
        }
        System.out.println(students);
        System.out.println("Enter number of students who got Sandwich:");
        int num_got_sandwich = sc.nextInt();
        sc.nextLine();
        while(num_got_sandwich > 0)
        {
            students.poll();
            num_got_sandwich=num_got_sandwich -1;
        }
        System.out.println("Students who did not got Sandwich = " + students);
        System.out.println("You can provide them sandwich");
        sc.close();
    }
}
