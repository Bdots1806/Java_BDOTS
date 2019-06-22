import java.util.*;

class p3
{
	public static void main(String args[])
	{
		int a,b,add,sub,mul;
		float div;
		Scanner aa = new Scanner(System.in);
		System.out.println("Enter Number A = ");
		a = aa.nextInt();
		System.out.println("Enter Number B = ");
		b = aa.nextInt();

		add = a+b;
		sub = a-b;
		mul = a*b;
		div = a/b;

		System.out.println("Addition is "+add);
		System.out.println("Sub is "+sub);
		System.out.println("Multiplaction is "+mul);
		System.out.println("Division is "+div);

		aa.close();
	}
};