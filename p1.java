import java.util.*;


class p1{
	public static void main(String args[]) //throws IOException
	{
		int rs;
		int dol;
	Scanner aa = new Scanner(System.in);
	System.out.println("Enter the amount in Rupees =");
	rs = aa.nextInt();
	dol=rs/60;
	System.out.println("The Rs into Doller is="+dol);
	aa.close();    
	   
	}

};
