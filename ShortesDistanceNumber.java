package Questions2;

public class ShortesDistanceNumber
{
/*
* 3,4,6,9,0,4,2,1 ; find 4,2 shortest distance 
*/
    public int findDistance(int x , int y, int[] array)
    {
        int i = 0 ; // find the first occurance element in (x or y), 
        int prev = 0; // store the first occrance element location 
        int min = Integer.MAX_VALUE ;
        for( ; i < array.length ; i ++ )
        {
            if( array[i] == x || array[i] == y)
            {
                prev = i ;
                break ;
            }
        }
        // for the ongoing elements, keep finding the remaining element in(x or y)
        while(i<array.length)
        {
            if(array[i] ==x || array[i]==y) // if found the element in rest array
            {
                if(array[prev] != array[i] && i-prev < min) // found the element not the same with previous one , and the distance between the two is less than min 
                {
                    min = i-prev ;
                    prev = i ;
                }
                else
                prev = i ;  // if distance is larger than min or if the element appeared again 
            }
            i++ ;
        }
        return min ;
    }
    
    public static void main(String[] args)
    {
    	int[] array = {3,4,5,6,2,3,4,5,6} ;
    	ShortesDistanceNumber sp = new ShortesDistanceNumber() ;
    	System.out.println(" " + sp.findDistance(3, 2, array)) ;
    }
}