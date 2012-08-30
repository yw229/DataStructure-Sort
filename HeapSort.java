
public class HeapSort {
	private int parent(int i)
	{
		return (i-1)/2 ;
	}

	private int left (int i)
	{
		return 2*i+1 ;
	}
	private int right (int i)
	{
		return 2*i+2 ;
	}
	
	private void heapify ( int array[], int len, int i)
	{
		int l = left (i) ;
		int r = right (i) ;
		//int len = array.length ;
		int largest = -1 ;
		
		if ( l<len &&   (array[l]> array[i])  )
			largest = l ;
		else
			largest = i;
		
		if ( r<len && array[r] >array[largest] )
			largest = r ; 
		
		
		if ( largest != i)
		{
			swap ( array, i,largest) ;
			heapify (array,len,largest) ;
		} 
		/*int l = left(i);
		int r = right(i);
		int largest = -1;;
		
		if (l < len && array[l] > array[i])
			largest = l;
		else
			largest = i;
		
		if (r < len && array[r] > array[largest])
			largest = r;
		
		if (largest != i) {
			
			swap( array, i, largest);
			
			heapify (array, len, largest);
		}*/

	}
	private void Heapify (int[] data, int i) {
		heapify (data, data.length, i);
	}

	private void buildMaxHeap (int[] data)
	{
		for (int i = data.length/2 -1 ;i >=0 ; i --)
		{
			Heapify (data, i) ;
		}
	}
	private void swap(int[] array, int i, int largest) {
		// TODO Auto-generated method stub
		int temp = array[i] ;
		array[i] = array[largest] ;
		array[largest] = temp ;
	}
	public void sort (int[] array)
	{
		int len = array.length ;
		buildMaxHeap (array) ;
		
		for (int i = array.length-1; i >= 1; i--) {			
			swap(array, 0, i);
			len --;
			heapify ( array,len, 0);
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] test = Tools.random(10, 1000);
		int[] test = new int[]{8,7,9,3,14,10,2,4,1,16};
		//Tools.print(test);
		HeapSort s = new HeapSort();
		s.sort(test) ;
		//Tools.print(test);
		
System.out.println("  After insert sort the array is:");
		
		for (int i=0; i<test.length;i++)
		{
			//Array[i] =rand.nextInt(Size); 
			System.out.print(test[i]+" ");
		}
	}

}
