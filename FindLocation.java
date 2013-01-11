package Question9;

public class FindLocation {
	public static int search (String[] strings, String s, int first,int last)
	{
		while ( first <= last)
		{
			while (first<=last && strings[last] =="")
			{
				last -- ;
			}
			if ( last < first)
				return -1 ;
			int mid = (last + first) /2 ;
			
			while (strings[mid] =="")
			{
				mid ++ ;
			}
			int r = strings[mid].compareTo(s) ;
			if (r == 0) return mid ;
			if (r <0)
				first = mid + 1 ;
			if (r > 0)
				last = mid -1 ;
		}
		return -1;
	}
	
	public static int search (String[] strings, String s)
	{
		if (strings == null || s==null)
			return -1 ;
		if ( s == "")
		{
			for (int i = 0 ; i< strings.length; i ++)
			{
				if (strings[i] == "") return i ;
			}
			return -1;
		}
		return search( strings,  s, 0,strings.length-1) ;
	}
	public static void main (String[] args)
	{
		String[] list = {"apple","","","banana","","","carrot","duck","",
				"","eel","","flower"} ;
		for (String s : list)
		{
			System.out.println("<"+s+">" + 
		"appears at location" 
		+ search(list,s));
		}
	}
	
}


