package lab3;
import java.util.*;
public class Exercise2 
{
	public void getImage(String str)
	{
		
		StringBuilder sb=new StringBuilder(str);
		StringBuilder s=sb.reverse();
		System.out.println("String Image ");
		System.out.println(str+"|"+s);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String ss=sc.nextLine();

		Exercise2 obj=new Exercise2();
		obj.getImage(ss);
		

	}

}
