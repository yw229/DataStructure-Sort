package Questions2;

import java.util.Stack;

public class ReverseString
{
    public String s ;
    public ReverseString(String s)
    {
        this.s = s; 
    }
    /*Method 1 string buffer and stack to reverse the word 
     * */
    public String reverse()
    {
        Stack<String> words = new Stack<String>() ;
        char[] r = s.toCharArray() ;
        StringBuffer sb = new StringBuffer() ; 
        String[] w = s.split(" ");
        
        for(String c : w)
        {
            words.push(c) ;
        }
        while(!words.isEmpty())
        {
        
        	sb.append(words.pop()) ;
            
            sb.append(" ") ;
        }
        return sb.substring(0, s.length()) .toString();
    }
    public String reverseAllChar(String s)  // reverse the whole string word first 
    {
    	String newReverse = "" ;
    	for(int i = s.length() -1 ; i>=0 ; i --)
    	{
    		newReverse = newReverse + s.charAt(i) ;
    	}
    	return newReverse ;
    }
    public String ReverseOrder(String s) // divide the reversed string into chunks by splitting the space, 
    {
    	String rs = reverseAllChar(s) ;
    	String[] each = rs.split(" ") ;
    	String newRe = "" ;
    	for(String e : each)
    	{
    		newRe = newRe +" " + reverseAllChar(e) ; // reverse each chunk and compose them into new String with space
    	}
    	return newRe ;
    }
    
    public static void main(String[] args)
    {
    	String s = "hello the world" ;
    	ReverseString rs = new ReverseString("hello the world") ;
    	char[] r = s.toCharArray() ;
    	
    		System.out.print(r) ;
    		System.out.println() ;
    	System.out.print(rs.reverse()  +" "  + rs.ReverseOrder(s)) ;
    }
}