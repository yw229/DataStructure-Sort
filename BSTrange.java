package Questions2;

public class BSTrange
{
    public int lowbound(int[] array , int v)
    {
        int l = 0 ;
        int h = array.length -1 , mid ;
        while(l<=h) // find the lowestbound, binary search
        {
             mid = (l + h) >> 1 ;
            if( array[mid] < v )  // mid value less  than taget , go to right tree
               l = mid +1 ; // right side search
            else
               // if(array[mid] < v)  // mid value <= target, go to left side, find the lowest bound
                  h = mid - 1 ;    

        }

    return l ;

}


public int highbound(int[] array , int v)

{
        int l = 0 ;
        int h = array.length -1 , mid ;
        while(l<h) 
        {
            mid = (l + h) >> 1 ;
            if( array[mid] > v )  // right side , find the h 
                h = mid -1 ;
            else
               // if(array[mid] < v) // mid < = v go to left 
                    l = mid + 1 ;    

        }

    return h ;

}
	public static void main(String[] args)
	{
		int[] array = {2,2,3,3,3,4,4,5,5,6,6} ;
		BSTrange bst = new BSTrange();
		System.out.println( bst.lowbound(array, 5) +" " + bst.highbound(array, 5)) ;
		System.out.println( bst.lowbound(array, 2) +" " + bst.highbound(array, 2)) ;
	}
}
