package LinkedIn;

public class Sqr {
    public double sqrt(double x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x < 0) return -1 ; 
        if(x == 0 || x == 1)
        return x ;
        double s = 0 ; 
        double e= x ;
        double diff =  0.00001 ;
        if(x<1) e = 1;
        while(e-s >diff)
        {
            double mid =  (int)s+(e-s)/2  ; 
            double midsq = mid * mid ;
            if( midsq == x) return mid ;
            else
                if(midsq > x) // focus on the left smaller part
                   e = mid ;
                else
                    s = mid ;
                  
        }
        return  (s+(e-s)/2) ; // if no exact sqrt found
    }
    public static void main(String[] args)
    {
    	Sqr sq = new Sqr() ;
    	System.out.println(sq.sqrt(7.0)) ;
    	
    }
}