import java.util.Random;


public class QuickSort {
	private int[] numbers ;
	private int number ;
	
	public void Sort ( int[] values)
	{
		if (values == null || values.length == 0)
			return ;
		this.number = values.length ;
		this.numbers = values ;
		
		QuickSort (0, number -1) ;
	}

	private void QuickSort(int low, int high) {
		// TODO Auto-generated method stub
		int i = low ; int j = high ;
		int pivot = numbers[ low + (high-low) /2] ; 
		while ( i <= j)
		{
			while ( numbers[i] < pivot)
			{
				i ++ ;
			}
			while ( numbers[j] > pivot)
			{
				
				j-- ;
			}
			if ( i <=j)
			{
				swap (i,j) ;
				i ++ ;
				j -- ;
			}
		}
		if (low < j)
			QuickSort(low, j);
		if (i < high)
			QuickSort(i, high);

			
	}

	private void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;

	}
	
	public static void main(String args[])
	{
	 	int Size=10;
		int[] Array=new int[Size] ;
		Random rand=new Random();
		QuickSort sort = new QuickSort();
		
		System.out.println("Before insert sort the array is:");
		for (int i=0; i<Array.length;i++)
		{
			Array[i] =rand.nextInt(Size); 
			System.out.print(Array[i]+" ");
		}
		
		sort.Sort(Array) ;
		System.out.println("  After insert sort the array is:");
		
		for (int i=0; i<Array.length;i++)
		{
			//Array[i] =rand.nextInt(Size); 
			System.out.print(Array[i]+" ");
		}
	}

}
