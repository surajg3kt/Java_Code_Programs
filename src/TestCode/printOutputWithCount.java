package TestCode;

public class printOutputWithCount {

	public static void main(String[] args) 
	{
		String s="karnataka";
		
		int[] count=new int[256];
		
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++ ;
		}
		
		for(int j=0;j<s.length();j++)
		{
			char name = s.charAt(j);
			
			if(count[name]!=0)
			{
				System.out.print(name+""+count[name]);
			}
			count[name]=0;
		}

	}

}
