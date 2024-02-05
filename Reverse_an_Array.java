package Arrays_and_Strings;

import java.util.Scanner;

public class Reverse_an_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(arr.length);
		System.out.println("Reversed elements are ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			 if (i < n - 1) {
                 System.out.print(" ");
             }
		}
	}

}
