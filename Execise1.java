package lab3;
import java.util.*;
public class Execise1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			String s=st.nextToken();
			num=Integer.parseInt(s);
			System.out.println(num);
			sum=sum+num;
		}
		System.out.println("Sum is "+sum);

	}

}
