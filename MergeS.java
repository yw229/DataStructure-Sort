import java.util.Random;


public class MergeS {
	private int[] numbers ;
	private int[] helper ;
	
	private int number ;
	
	public void Sort ( int[] values) 
	{
		this.numbers = values ;
		number = values.length ;
		this.helper = new int [number] ;
		mergeS ( 0 , number -1) ;
	}

	private void mergeS(int low, int high) {
		// TODO Auto-generated method stub
		//this.numbers = values ;
		if (low < high)
		{
			int mid = ( low + high) /2 ;
			mergeS (  low , mid ) ;
			mergeS(  mid + 1 ,high) ;
			
			merge ( low, mid , high) ;
		}

	}

	private void merge(int low, int mid, int high) {
		// TODO Auto-generated method stub
		for ( int i = low ; i <= high ; i ++)
		{
			helper[i] = numbers[i] ;
		}
		int i = low ;
		int j =  mid + 1;
		int k = low ; // copy the smallest from either left or right 
		while (i <=mid && j <= high)
		{
			if ( helper[i] <= helper[j])
			{
				numbers[k] = helper[i] ;
				i++;
			}
			else
			{
				numbers [k] = helper[j] ;
				j++ ;
			}
			k++ ;
		}
		while (i<=mid)
		{
			numbers[k] = helper[i] ;
			k++ ;
			i++ ;
		}
	}
	public static void main(String args[])
	{
	 	int Size=10;
		int[] Array=new int[Size] ;
		Random rand=new Random();
		MergeS sort = new MergeS();
		
		System.out.println("Before insert sort the array is:");
		for (int i=0; i<Array.length;i++)
		{
			Array[i] =rand.nextInt(Size); 
			System.out.print(Array[i]+" ");
		}
		
		sort.Sort(Array) ;
		System.out.println("  After Merge sort the array is:");
		
		for (int i=0; i<Array.length;i++)
		{
			//Array[i] =rand.nextInt(Size); 
			System.out.print(Array[i]+" ");
		}
	}

}
