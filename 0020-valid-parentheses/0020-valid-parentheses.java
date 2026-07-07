class Solution 
{
    public boolean isValid(String s) 
    {
    
        Stack<Character> check= new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch= s.charAt(i);
            if(ch == '(' || ch== '{' || ch== '[')
            {
                check.push(ch);

            }
            else
            {
                if(check.isEmpty()) return false;
                char top= check.peek();

                if( (ch==')' && top== '(')  || (ch=='}' && top== '{') || (ch==']' && top== '['))
                {
                    check.pop();
                }
                else return false;
            }
        }
        if(check.isEmpty()) return true;
        return false;
        
    }
}