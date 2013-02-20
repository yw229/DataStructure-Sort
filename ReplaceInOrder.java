package Question3;

import java.util.HashMap;
import java.util.HashSet;

public class ReplaceInOrder {
	public String replace (String s, String e)
	{
		if(s==null || e == null) return null ; 
		if(e.length() > s.length() ) return null ;
		//HashSet<Character> dic = new HashSet<Character>() ;
		HashMap<Character, Integer> map = new HashMap<Character,Integer>() ;
		String news = "" ;
		for(char c : e.toCharArray())
		{	
			map.put(c, 0) ;
		}
		for(char ele : s.toCharArray()) // make statistics of each char occurrence in the string 
		{
			if(map.containsKey(ele))
			{
				 Integer freq = map.get(ele) ;
				 map.put(ele, freq == null ? 1 : freq +1 ) ;
			}
				
			
		}
		for(char ec : e.toCharArray()) // based on the given string order to reconstruct the string
		{
			
				for(int j = 0 ; j < map.get(ec) ; j ++)
				{
					news += ec ;
				}
			
		}
		for(char out : s.toCharArray())
		{
			if( !map.containsKey(out))
				news = news + out ;
		}
	
		return news ;
	}
	
	public static void main (String[] args)
	{
		ReplaceInOrder rp = new ReplaceInOrder() ;
		String s = rp.replace("bbananaaaaaaa", "na") ;
		System.out.println(s) ;
	}

}
