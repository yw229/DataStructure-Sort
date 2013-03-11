package Blmbg;

import java.util.ArrayList;

public class PanlidromePartition {
    public ArrayList<ArrayList<String>> partition(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<String>>  result = new ArrayList<ArrayList<String>>();
        if(s==null) result.add(new ArrayList<String>() ) ;
        result = DFS(s) ;
        return result ;
    }
    
    public ArrayList<ArrayList<String>> DFS(String s)
    {
        ArrayList<ArrayList<String>>  result = new ArrayList<ArrayList<String>> () ;
        if(s.length() == 0) 
        {
            result.add(new ArrayList<String>() ) ; // base case 
            return result ;
        }
        if(s.length()==1)
        {
            result.add(new ArrayList<String>() ) ;  // base case 
            result.get(0).add(s) ;
            return result ;
        }
        for(int i = 1 ; i <=s.length() ; i ++) // DFS iterate 
        {
          if( isPalin(s.substring(0,i)) ) // check the first 0-i substring ; 
            {
                ArrayList<ArrayList<String>> temp = DFS(s.substring(i)); // DFS recursively find the sub 
                System.out.println("DFS" + temp) ;
                for( ArrayList<String> r : temp)
                {
                    r.add(0,s.substring(0,i)) ; // backtrack in order
                    result.add(r) ;
                }
                

            }
        }
        return result ;
    }
    
    public boolean isPalin(String s)
    {
        if(s==null) return false ;
        for(int i = 0 ; i < s.length() /2 ; i ++)
        {
            if(s.charAt(i) != s.charAt(s.length()-i-1))
                return false ;
        }
        return true ;
    }
    
    public static void main(String[] args)
    {
    	String s= "dfgagfd" ;
    	PanlidromePartition pl = new PanlidromePartition() ;
    	System.out.println(pl.partition(s)) ;
    }
}