import java.util.ArrayList;

public class Q3 {
	
	public static int ispalin(String s)
	{
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return 0;
			}
		}
		return 1;
	}
	public static ArrayList<String> palin(ArrayList<String> a)
	{
		ArrayList<String> l=new ArrayList<String>();
		a.forEach(s->{
			if(ispalin(s)==1)
				l.add(s);
		}
		
				);
		return l;
	}

}
