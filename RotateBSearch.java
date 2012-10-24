package Question9;

public class RotateBSearch {
	public static int RotateSearch (int[] a, int low, int high, int x)
	{
		int l = low ;
		int h = high ;
		while (l <= h)
		{
			int m = (l+h)/2 ;
			if (x == a[m])
				return m;
			
			if (a[l] < a[m])
			{
				if ( x > a[m])
					l = m+1;
				if ( x <= a[m])
				{
					
					if ( x >= a[l])
						h = m-1 ;
					else
						l = m +1 ;
				}
			}
			else
				if ( a[l] >= a[m])
				{
					if (x <=a[h] && x>a[m]) l = m+1;
					if (x <=a[h] && x<a[m]) h = m-1 ;
					/*if (x >a[h] && x >a[m]) h = m-1;
					if (x >a[h] && x <=a[m]) h = m-1;*/
					if (x >a[h]) h = m-1;
				}
					
		}
		return -1;
	}
	public static int RotateBSearch(int a[], int x)
	{
		return RotateSearch(a,0,a.length-1,x);
	}
	public static void main (String[] args)
	{
		int[] a ={4,5,6,7,8,9,1,2,3};
		for (int x :a)
		{
			System.out.println(x +" position" + RotateBSearch(a,x)) ;
		}
	}

}
