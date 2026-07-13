class Solution 
{
    public int longestValidParentheses(String s) 
    {
        int count=0;
        Stack<Integer> arr= new Stack<>();
        arr.push(-1);
        for(int i=0; i<s.length(); i++)
        {
            char ch= s.charAt(i);
            if(ch=='(')
            {
                arr.push(i);
            }
            else 
            {
                arr.pop();
                if(arr.isEmpty())
                {
                    arr.push(i);

                }
                else count= Math.max(count, i-arr.peek());
            }
        }
        return count;
    }
}