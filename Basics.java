import java.util.*;
public class Basics
{
    public static void main(String[] args)
    {
        Stack<Integer> numbers=new Stack<Integer>();
        numbers.push(10);
        numbers.push(100);
        numbers.push(300);
        numbers.push(30);
        numbers.pop();
        System.out.println(numbers.peek());
        System.out.println(numbers.peek());

    }

}