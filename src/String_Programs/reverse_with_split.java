package String_Programs;

public class reverse_with_split
{
	public static void main(String[] args) 
	{
		String s="my name is Suraj";
		String[] arr = s.split(" ");
		
		String rev="";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			
		   System.out.print(arr[i]+" ");
		}
		
	}

}
