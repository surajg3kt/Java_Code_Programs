package Programmes_Interview;

public class Duplicate_in_Array 
{
	
	public static void main(String[] args) 
	{
		//to print the duplicate values
//		int[] dup= {10,20,30,10,50,20};
//		
//		for(int i=0;i<dup.length;i++)
//		{
//			for(int j=i+1;j<dup.length;j++)
//			{
//				if(dup[i]==(dup[j]))
//				{
//					System.out.println(dup[j]);
//				}
//			}
//		}
		
		//to remove duplicate from Array
//		String[] dup= {"sur","raj","dhanu","sur","sam"};
//		
//		for(int i=0;i<dup.length;i++)
//		{
//			for(int j=i+1;j<dup.length;j++)
//			{
//				if(dup[i].equals(dup[j]))
//				{
//					dup[j]="duplicate";
//				}
//			}
//		}
//		for(int k=0;k<dup.length;k++)
//		{
//			if(dup[k]!="duplicate")
//			{
//				System.out.println(dup[k]);
//			}
//		}
		
		 //program to identify duplicate characters in given string
		  char[] dup={'a','d','k','s','d','m'};
		  
		  for(int i=0;i<dup.length;i++)
		  {
		    for(int j=i+1;j<dup.length;j++)
		    {
		      if(dup[i]==dup[j])
		      {
		         System.out.println(dup[i]);
		      }
		    }

		  }
	 }

}
