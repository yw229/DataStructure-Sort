package Question9;

import java.util.ArrayList;
import java.util.Collections;

public class computeLargestPossibleUnmatch {
	
	public ArrayList<HtWt> items ;
	public ArrayList<HtWt> maxSeq ;
	public int count ;
	
	public ArrayList<HtWt> maxSeq(ArrayList<HtWt> seq1, ArrayList<HtWt> seq2)
	{
		return seq1.size() > seq2.size()? seq1:seq2 ;
	}
	
	public int fillSeqUnfit (int startUn , ArrayList<HtWt> Seq)
	{
		int currentUn = startUn ;
		if ( startUn < items.size()) // startUn is less than items list size 
		{
			for (int i = 0 ; i < items.size(); i ++)
			{
				HtWt it = items.get(i);
				
				if ( i == 0 || items.get(i-1).isBefore(items.get(i-1),it))
						Seq.add(it) ;
				else
					currentUn = i ;
	
			}
		}
		
		return currentUn;
		}
	
	public void FindMaxSeq ()
	{
		Collections.sort(items, new HtWt()) ; // sort item list based on the critieria 
		int currentUn = 0 ;
		while ( currentUn < items.size())
		{
			ArrayList<HtWt> Seq = new ArrayList<HtWt>() ;
			int unfit = fillSeqUnfit(currentUn,Seq) ;
			maxSeq = maxSeq(maxSeq,Seq) ;
			if (unfit != currentUn)
				currentUn = unfit ;
			else
				break ;
		}
	}
	public void initialize ()
	{
		maxSeq = new ArrayList<HtWt>() ;
		items = new ArrayList<HtWt>() ;
		//HtWt it = new HtWt(40,50);
		items.add(new  HtWt(40,50)) ;
		items.add(new  HtWt(67,123)) ;
		items.add(new  HtWt(67,90)) ;
		items.add(new  HtWt(58,100)) ;
		items.add(new  HtWt(60,70)) ;
		items.add(new  HtWt(70,80)) ;
		items.add(new  HtWt(80,89)) ;
		items.add(new  HtWt(58,80)) ;
		items.add(new  HtWt(40,60)) ;
		items.add(new  HtWt(45,77)) ;
		
		
	}
	public void print (ArrayList<HtWt> List)
	{
		for (HtWt it : List)
			System.out.println(it.toString() + " ") ;
	}
	public void print ()
	{
		print(maxSeq);
	}
	
	public static void main (String[] args)
	{
		computeLargestPossibleUnmatch q= new computeLargestPossibleUnmatch();
		q.initialize();
		q.FindMaxSeq();
		q.print();
	}

}
