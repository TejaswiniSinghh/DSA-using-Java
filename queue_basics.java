import java.util.*;
public class queue_basics
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(18);
        queue.offer(19);
        queue.offer(10);
        queue.offer(100);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.contains(100));
        System.out.println(queue);
    }
}