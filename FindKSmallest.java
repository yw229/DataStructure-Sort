package Question9;

public class FindKSmallest
{
    public int partitions (int[] array, int low ,int high)
    {
        int l = low ;
        int h = high ;
        int pivot = array[ (l + h)>>1 ];
        while(l<=h)
        {
            while(array[l] < pivot)
            {
                l++ ;
            }

            while(array[h] > pivot)
            {         	
            	h -- ;
            }

            if(l <= h)

            {

            	swap(array,l,h) ;
            	l++ ;
            	h-- ;

            }
    	

        }
		return pivot;


}
   // h+ 1 index  is the turning point into two subarray
    public  int partition( int[] array, int first, int last ) {
        int pivot = array[first ];
        int pivotPosition = first  ; //+ ( last-first)/2;
        first++;
        while ( first <= last ) {
          // scan right
          while ( ( first <= last ) && ( array[first] < pivot ) ) {
            first++;
          }

          // scan left
          while ( ( last >= first ) && ( array[last] >= pivot ) ) {
            last--;
          }

          if ( first > last ) {
            swap( array, pivotPosition, last );
          }
          else {
            swap( array, first, last );
          }
        }
        return last;
      }

      public  int kthSmallest( int k, int[] array, int first, int last ) {
    	  /**
    	  * ranking select, randomly pick a pivot, let ele value less than pivot on the left subarray, and let the value 
    	  * greater than pivot on right side. 
    	  * if pivot < k-1, k smallest on right side 
    	  * if pivot > k-1, k smallest on left side , 
    	  * if pivot = k-1, the pivot position ele  is target value 
    	  */
    	  	int pivotPosition;
	        pivotPosition = partition( array, first, last );
	        if ( pivotPosition == ( k - 1 ) ) {
	          return array[k - 1];
	        }
	        if ( ( k - 1 ) < pivotPosition ) {
	          return kthSmallest( k, array, first, pivotPosition - 1 );
	        }
	        else {
	          return kthSmallest( k, array, pivotPosition + 1, last );
	        }
      }



public void swap(int[] array, int a , int b)

{

    int temp = array[a] ;

    array[a] = array[b] ;

    array[b] = temp ;

    

}


public int findKSmallest(int[] array , int low, int high ,int k)

{/**
* ranking select, randomly pick a pivot, let ele value less than pivot on the left subarray, and let the value 
* greater than pivot on right side. 
* if pivot < k-1, k smallest on right side 
* if pivot > k-1, k smallest on left side , 
* if pivot = k-1, the pivot position ele  is target value 
*/

   // if(low > high || k > high ) return -1 ;

    int l = low ;
    int h = high ;
   /// int pivot = 0 ;
    int pivotPosition = 0;
   
    while(l<=h)
    {
     pivotPosition = partition( array, l, h );
    if( pivotPosition == k-1)
    	 return array[pivotPosition];
    else
    	if(   ( k - 1 ) < pivotPosition )
    		h = pivotPosition-1 ;
    	else
    		//if(pivotPosition < k-1)
    		l = pivotPosition + 1 ;
    }
    
    return -1 ;


}

public static void main(String[] args)
{
		int[] array = {3,7,9,11,5,0} ;
		FindKSmallest fk = new FindKSmallest();
		System.out.println(fk.partitions(array, 0, array.length -1)) ;
		System.out.println(fk.kthSmallest(3, array, 0 , array.length-1)) ;
		System.out.println(fk.findKSmallest(array, 0, array.length-1, 1)) ;
	}
}

