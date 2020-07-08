import java.util.ArrayList;
import java.util.Arrays;


public class Q1 {
	

	
	public static double average(ArrayList<Integer> a)
	{
		 return a.stream().mapToInt(b -> b).average().getAsDouble();
	}
	
	public static void main(String args[])
	{
		ArrayList<Integer> a= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println("Average= "+average(a));
		
		ArrayList<String> b=new ArrayList<String>(Arrays.asList("aba"," asdf","uhkvb","madam"));
		b=Q2.stringRet(b);
		System.out.print(b);
		
		ArrayList<String> s=Q3.palin(b);
		System.out.print(s);
		
		
	}
	
	

}
