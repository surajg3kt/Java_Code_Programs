package String_Programs;

public class StringtoChardup 
{
 public static void main(String[] args) 
 {
	String s="karnataka";
//	String rev="";
	
	//reverse the string
//	for(int i=s.length()-1;i>=0;i--)
//	{
//		rev=rev+s.charAt(i);
//	}
//	System.out.println(rev);
	
	char[] name = s.toCharArray();
	
	for(int i=0;i<name.length-1;i++)
	{
		for(int j=i+1;j<name.length-1;j++)
		{
			if(name[i]==name[j])
			{
				System.out.println(name[i]);
			}
		}
	}
 }
}
