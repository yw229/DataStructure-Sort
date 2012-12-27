package Question9;

public class RotateClockWise
{
    public int[][] Matrix ;
    public int n ;
    public RotateClockWise(int[][] Matrix, int n)
    {
        this.Matrix = Matrix ;
        this.n = n ;
    }
    public void Rotate()
    {
       for(int layer = 0 ; layer < n/2 ; layer ++) 
          {
               int start = layer ; // first element in the layer 
               int last = n- start - 1 ; // last element in the layer
               for (int j = start ; j < last ; j ++  )
               {
                   int offset = j - start ;  // the number of elem between start and current
                   int top = Matrix[start][j] ; // top layer elements 
                    // left --> top  , clockwise rotate left to top
                   Matrix[start][j] = Matrix[last-offset][start] ;
                   
                   // bottom -- > left , clockwise rotate from bottom to left
                   Matrix[last-offset][start] = Matrix[last][last-offset] ;
                   
                   // right -- > bottom , clockwise rotate from right to bottom
                   Matrix[last][last-offset] = Matrix[j][last] ;
                   
                  // top-->right , clockwise rotate from top to right
                  Matrix[j][last] = top ;   
               }
          }
          
    }
    public static void printMat(int [][] max , int M, int N)
	{
		for (int i = 0 ; i<M ; i ++)
		{
			for (int j = 0 ; j < max[i].length ; j ++)
			{
				if (max[i][j] < 10 && max[i][j] > -10)
					System.out.print (" ") ;
				if (max[i][j] < 100 && max[i][j]> -100)
					System.out.print(" ") ;
				if (max[i][j] >=0)
					System.out.print(" ") ;
				System.out.print(" " + max[i][j]) ;
			}
			System.out.println() ;
		}
	}
    public static void main(String[] args)
    {
    	int[][] max = new int[10][10] ;
    	//int max[][] = new int[M][N] ;
		for (int i = 0 ; i < 10 ; i ++)
			for (int j= 0 ; j < 10 ; j ++)
			{
				 max[i][j] = 10 * i + j ;
			}
		printMat(max , 10, 10) ;
		RotateClockWise r = new RotateClockWise(max,10) ;
		r.Rotate() ;
		System.out.println("After rotate the matx is") ;
		printMat(max , 10, 10) ;
    }
       
}