package lab3;
import java.lang.Math;
import java.util.*;
public class Exercise4 {
	public void modifyNumber(int arr[])
	{
		int n=arr.length;
		int diff=0;
		for(int i=0;i<arr.length-1;i++)
		{
			diff=Math.abs(arr[i]-arr[i+1]);
			System.out.print(diff);
		}
		System.out.print(arr[n-1]);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int num=sc.nextInt();
		int arr1[]=new int[num];
		System.out.println("Enter elements: ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}

		Exercise4 obj=new Exercise4();
		obj.modifyNumber(arr1);
		

	}

}
