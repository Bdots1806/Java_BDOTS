import java.util.*;

class p2
{
	 public static void main(String args[])
	{
		int a,b,c,d,e,f,sum=0;
		float par = 0.0f;
		Scanner aa = new Scanner(System.in);
		System.out.println("Enter the marks of s1=");
		a = aa.nextInt();
		System.out.println("Enter the marks of s2=");
		b = aa.nextInt();
		System.out.println("Enter the marks of s3=");
		c = aa.nextInt();
		System.out.println("Enter the marks of s4=");
		d = aa.nextInt();
		System.out.println("Enter the marks of s5=");
		e = aa.nextInt();
		System.out.println("Enter the marks of s6=");
		f = aa.nextInt();

		sum = a+b+c+d+e+f;
		par = (sum*100)/600;
		System.out.println("the percantage is = "+par+" %");
		aa.close();

	}


};