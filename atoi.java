package Questions2;

public class atoi
{
 
    public int ato(String s)
    {
    	int sign = 1 ;
        int index = 0 ;
        int sum = 0 ; 
        if(s.length() <1 ) return 0 ;
        if(s.charAt(0) == '+')
         {

        	sign = 1 ;

        	index ++ ;

         }
        if(s.charAt(0) == '-')
         {

        	sign = -1 ;

        	index ++ ;

            }
        while(s.charAt(0) == ' ')
        {

        	index++ ;

         }
        for( ; index < s.length() ; index ++)
        {
            if(s.charAt(index) <'0'|| s.charAt(index) >'9') // ASCI 
                break ;
            sum = sum* 10 + (s.charAt(index)-'0') ; // find the integer ascii

            if(sum > Integer.MAX_VALUE && sign ==1)  
            	break ;
        }

        if(sum*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE ;


if(sum *sign < Integer.MIN_VALUE) return Integer.MIN_VALUE ;



return sum*sign ;


    }
    public static void main(String[] args)
    {
    	String s = "-12" ;
    	atoi a = new atoi();
    	System.out.println( " " + a.ato(s) ) ;
    }
}
