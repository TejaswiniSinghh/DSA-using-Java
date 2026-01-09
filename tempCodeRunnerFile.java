public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int[] array= new int[x];
        for(int i=0; i<x; i++)
        {
            array[i]= sc.nextInt();
        }
        System.out.println(count_record(array));
        sc.close();
    }
}