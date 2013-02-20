package Question9;

public class MatrixFind {
	public static boolean findMatrix (int[][] mat, int data, int M, int N)
	{
		
		int col = N-1;
		int row = 0 ;
		while (row <M && col >=0)
		{
			if (mat[row][col] == data)
				return true ;
			if (mat[row][col] > data)
			{
				col --  ;
			}
			else
				row ++ ;
		}
		
		return false;
		
	}
	
	public static boolean findMatrixR (int[][] mat, int data, int M, int N)
	{
		
		int col = 0;
		int row = M-1 ;
		while (row <M && col >=0)
		{
			if (mat[row][col] == data)
				return true ;
			if (mat[row][col] > data)
			{
				row --  ;
			}
			else
				col ++ ;
		}
		
		return false;
		
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
	public static void main (String[] args)
	{
		int M = 5 ;
		int N =10 ;
		int max[][] = new int[M][N] ;
		for (int i = 0 ; i < M ; i ++)
			for (int j= 0 ; j < N ; j ++)
			{
				 max[i][j] = 10 * i + j ;
			}
		
		printMat (max, M,N) ;
		
		for (int i = 0 ; i < M; i ++)
			for (int j = 0 ; j < M; j ++)
			{
				int v = 10*i+j ;
				System.out.println(v + ":" + findMatrixR(max, v, M, N)) ;
			}
		
	}

}
