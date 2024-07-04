package Programmes_Interview;

public class sumOfDigits //check armstrong or not
{
	public static void main(String[] args)
	{
		  int num=153;
		  int sum=0;
		  
//		  while(num!=0)
//		  { 
//		    int rem=num%10;
//		       sum=sum+rem;
//		       num=num/10;
//		  }
//		   System.out.println(sum);
		  
		  //to find sum of even digits
//		  while(num!=0)
//		  {
//			 int rem=num%10;
//			  
//			  if(rem%2==0)
//			  {
//				  sum=sum+rem;
//			  }
//			  num=num/10;
//		  }
//		  System.out.println(sum);
		  
		  //to find sum of squares of given digit
//		  while(num!=0)
//		  {
//			  int rem=num%10;
//			   sum=sum+(rem*rem);
//			   num=num/10;
//		  }
//		  System.out.println(sum);
		  
		  //to find sum of cube of given digit/ Armstrong number(153)
//		  int arm=num;
//		  while(num!=0)
//		  {
//			  int rem=num%10;
//			   sum=sum+(rem*rem*rem);
//			   num=num/10;
//		  }
//		  System.out.println(sum);
//		  
//		  if(sum==arm)
//		  {
//			  System.out.println(sum+" is armstrong number");
//		  }
//		  else
//		  {
//			  System.out.println(sum+" is not a armstrong number");
//		  }
		  
		  
		  //to find num is Strong or not/sum of factorial of digit(145)
		  int strong=num;
		  while(num!=0)
		  {
			  int rem=num%10;
			  int fact=1;
			  
			  for(int i=rem;i>=1;i--)
			  {
				  fact=fact*i;
			  }
			  
			  sum=sum+fact;
			  num=num/10;
		  }
		  System.out.println(sum);
		  
		  if(sum==strong)
		  {
			  System.out.println(sum+" is a strong number");
		  }
		  else
		  {
			  System.out.println(sum +" is not a strong number");
		  }
	}

}
