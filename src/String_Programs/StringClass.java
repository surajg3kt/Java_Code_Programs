package String_Programs;

public class StringClass 
{
	public static void main(String[] args)
	{
		String s="suraj";
		
		System.out.println(s.length());//length of string
		
		char ch = s.charAt(0);//convert string to char
		System.out.println(ch);
		
		System.out.println(s.substring(2));//substring starts from index 2
		
		System.out.println(s.substring(1,5));//starts at 1 ends at 4
		
		System.out.println(s.concat("SRK"));//combines srk to string
		
		String a="my name is suraj";
		
		String[] arr = a.split(" ");// used to remove space between words 
		for(int i=arr.length-1;i>=0;i--)// print sentence in reverse order
		{
			
		System.out.print(arr[i]);
		}
		System.out.println("\n");// to print in next line
		System.out.println(s.equals(a));// check string s equals to string a
		
		System.out.println(s.replace('r', 'p'));//replaces p in place of r in the word
		
	    String rev="";// code to reverse string
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
