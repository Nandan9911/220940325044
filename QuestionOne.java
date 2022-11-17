import java.util.*;
class QuestionOne
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<>();
		String s;
		while(true)
		{
			System.out.print("Enter string element/Enter 0 to exit :");
			s=sc.next();
			if(s.equals("0"))
				break;
			else
				a.add(s);
		}
		
		Iterator i = a.iterator();
		
		if(a.size()==0)
		{
		   System.out.println("\nArrayList is empty");
		}
		else
		{
		System.out.println("\nPrinting the ArrayList");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		}
		
		
	}
}