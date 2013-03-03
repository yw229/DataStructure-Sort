package Questions2;

public class isSubString {
	public boolean isSub(String s, String t)
	{
		boolean findNon ;
		for(int i = 0 ; i < s.length() ; i ++ )
		{
			findNon = false ;
			for(int j = 0 ; j < t.length() ; j ++)
			{
				if(s.charAt(i+j) != t.charAt(j))
				{	
					findNon = true ;
					break ;
				}
			}
			if(!findNon) return true ;
		}
		
		return false;
		
	}
	public static void main(String[] args)
	{
		String s = "abcde" ;
		String t = "afg" ;
		isSubString test = new isSubString();
		System.out.println( test.isSub(s, t)) ;
	}

}
