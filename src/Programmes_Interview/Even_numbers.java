package Programmes_Interview;

import java.util.Scanner;

public class Even_numbers 
{
	public static void giveeven()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		
		int num = scan.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" is a even number");
		}
		else
		{
			System.out.println(num+" is a odd number");
		}
	}

	public static void main(String[] args) 
	{
//		int n=20;
//		for(int i=1;i<=n;i++)
//		{
//			if(i%2==0)
//			{
//				System.out.println(i);
//			}
//		}
      giveeven();
	}

}
