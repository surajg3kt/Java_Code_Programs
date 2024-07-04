package Programmes_Interview;

public class Array_programme 
{
	public static void main(String[] args) 
	{
		//storing elements in array with using new operator
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println("array length is "+arr.length);//to find length of array
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);//to print array elements
		}
		
		//to find sum of array elements
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array element is "+sum);
		
		
		//storing elements in array without using new operator
		String[] att= {"sur","raj","suji","dhan","sam"};
		
		for(int i=0;i<att.length;i++)
		{
			System.out.println(att[i]);
		}
		System.out.println(att.length);
	}
	

}
