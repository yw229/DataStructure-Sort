package Question9;

import java.util.Comparator;

public class HtWt implements Comparator<HtWt> {
	private int Ht ;
	private int Wt ;
	public HtWt (int Ht, int Wt)
	{
		this.Ht = Ht ;
		this.Wt = Wt ;
	}
	public HtWt()
	{
		
	}
	/*@Override
	public int compareTo(Object s) {
		// TODO Auto-generated method stub
		HtWt second = (HtWt) s ;
		if (this.Ht != second.Ht)
			return ((Integer)(this.Ht)).compareTo(second.Ht) ;
		return 0;
	}*/
	@Override
	public int compare(HtWt O1, HtWt O2) {
		// TODO Auto-generated method stub
		this.equals(O1) ;
		if ( O1.Ht != O2.Ht)
			return ((Integer)O1.Ht).compareTo( (Integer)O2.Ht);
		else
			return ((Integer)O1.Wt).compareTo((Integer)O2.Wt);
		
	}
	public boolean isBefore (HtWt O1, HtWt O2)
	{
		this.equals(O1);
		if (O1.Ht < O2.Ht && O1.Wt < O2.Wt)
			return true ;
		else
			return false;
	}
	public String toString()
	{
		return "("+ this.Ht+ "," + this.Wt + ")";
	}

}
