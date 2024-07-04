package Programmes_Interview;

public class Linear_Search 
{
	public static void main(String[] args)
	{
		//to find the number, Linear search
		int[] arr= {2,4,7,9,3,8};
		int find=7;
		
		for(int i=0;i<arr.length;i++)
		{
			if(find==arr[i])
			{
				System.out.println(find +" is found");
			
			}
		}
		
		//to find largest element in array
//		int largest=arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>largest)
//			{
//				largest=arr[i];
//			}
//		}
//		System.out.println("largest number is "+largest);
		
		
		//to find smallest element in array
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
	}

}
