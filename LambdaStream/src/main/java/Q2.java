import java.util.ArrayList;
public class Q2 {
	
	public static ArrayList<String> stringRet(ArrayList<String> a)
	{
		ArrayList<String> l=new ArrayList<String>();
		a.forEach(s ->{
			if(s.startsWith("a")) 
				l.add(s);
		}
		) ;
		return l;	
	}
	

}
