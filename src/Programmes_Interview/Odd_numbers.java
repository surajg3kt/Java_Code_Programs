package Programmes_Interview;

import java.util.Scanner;

public class Odd_numbers 
{
	public static void giveodd()
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int num=scan.nextInt();
		
		if(num%2==1)
		{
			System.out.println(num+" is a odd number");
		}
		else {
			System.out.println(num+ " is a even number");
		}
	}
	
	public static void main(String[] args)
	{
//		int n=25;
//		
//		for(int i=1;i<=n;i++)
//		{
//			if(i%2==1)
//			{
//				System.out.println(i);
//			}
//		}
		giveodd();
	}

}
