import java.util.*;


class input{
    public static void main(String args[]) //throws IOException
    {
        int a;
        float b;
    Scanner aa = new Scanner(System.in);
    System.out.println("Enter the value of a=");
    a = aa.nextInt();
    System.out.println("Entered vlaue of a was="+a);
    System.out.println("Enter the float value");
    b = aa.nextFloat();
    System.out.println("Entered float value was = "+b);    
        
    aa.close();    
       
    }

};
