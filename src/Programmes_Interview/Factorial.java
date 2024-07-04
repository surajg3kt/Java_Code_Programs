package Programmes_Interview;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		//int a=5;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		int num=obj.nextInt();
		
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		 System.out.println(num+" factorial is "+fact);

	}

}
