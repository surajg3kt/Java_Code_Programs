package Programmes_Interview;

public class Bubble_sort //output is in ascending order
{
	public static void main(String[] args) 
	{
		int[] arr= {10,5,25,15,20,30,35,50,40};
		
		for(int i=0;i<arr.length-1;i++)//for repeating operation
		{
			for(int j=0;j<arr.length-1;j++)//for comparing values
			{
				if(arr[j]>arr[j+1])//to get descending order output change to "<"(less than)
				{
					int temp=arr[j];
					  arr[j]=arr[j+1];
					  arr[j+1]=temp;
				}
			}
		}
		
		for(int k=0;k<arr.length;k++)//to print values
		{
			System.out.print(arr[k]+" ");
		}
	}

}
