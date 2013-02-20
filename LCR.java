package Sort;

import java.util.Arrays;

public class LCR // longest common repeated characters
{
    public static String commonPrefix(String s, String e)
    {
        int min = Math.min(s.length(),e.length()) ;
        for(int i= 0 ; i < min ; i ++)
        {
            if(s.charAt(i) != e.charAt(i))
            {
                return s.substring(0,i) ; //  the last common 
            }
            
        }
        return s.substring(0,min) ;
    }
    public static String LCRword(String s) // find longest common repeated char in word
    {
        int N = s.length();
        String[] suffix = new String[N];
        for(int i = 0 ; i < N ; i ++)
        {
            suffix[i] = s.substring(i,N) ;
           // System.out.println("suffix " + suffix[i]) ;
            
        }
        Arrays.sort(suffix) ; // sort items based on the first char in the word array alphabetical  
        for(int i = 0 ; i < N ; i ++)
        {
            //suffix[i] = s.substring(i,N) ;
            System.out.println(" " + suffix[i]) ;
            
        }
        String lsr = " " ; 
        
        for(int i = 0 ; i < N-1 ;i++)
        {
            String temp = commonPrefix(suffix[i], suffix[i+1]) ; // compare the adjacent words, find common 
            if(temp.length()>lsr.length())
             lsr = temp ;
        }
        return lsr ;
    }
    
    public static void main(String[] args)
    {
    	String word ="testingtest" ;
    	
    	System.out.println("longest word is + "  + LCRword(word)) ;
    }
}

/*
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
      
        if(strs.length == 0 ) return "" ;
        
        int i = 0 ; int m = strs[0].length() ;
        for( int j = 1 ; j < strs.length; j ++)
        {
            if( m > strs[j].length())
            {
                m = strs[j].length() ;
                i = j ;
            }
        }
        String s ="" ;
        for(int len = 0 ; len< m ; len++)
        {
            for(int l = 1 ; l <strs.length ; l ++   )
            {
                if(strs[l].charAt(len) != strs[0].charAt(len))
                    return strs[0].substring(0,len);
            }
        }
        
        return strs[i] ;
    }



*/
