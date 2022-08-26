package class1;

public class Anup {

	public static void main(String[] args) {
		
	String name="varsha";
	String nm="anup";
	int l=name.length();
	int a=nm.length();
	
	for(int i=l-1;i>=0;i--) 
	{
		char c=name.charAt(i);
		System.out.print(c);
		
	}
		for(int i=a-1;i>=0;i--)
		{
			char d=nm.charAt(i);
			System.out.print(d);
		}

	}

}
