package Arrays_and_Strings;

import java.util.Scanner;

public class Maximum_Element_in_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Elements : ");
		int n=sc.nextInt();
		int[] myArray = new int[n];
		System.out.println("Enter the Elements : ");
		for( int i=0;i<n;i++) 
		{
			myArray[i]=sc.nextInt();
		}
		if(myArray.length==0)
		{
			System.out.println("ARRAY IS EMPTY");
		}
		else
		{
			System.out.println("");
			 System.out.println("Entered elements are ");
			 for (int i = 0; i < n; i++) 
				
	            {
	                System.out.print(myArray[i]);
	            
	                if (i < n - 1) {
	                    System.out.print(" ");
	                }

	            }
			 System.out.println("");
			 int k=myArray[0];
			 for(int i=0;i<n;i++) 
			 {
				 if(myArray[i]>k)
				 {
					 k=myArray[i];
				 }
			 }
	         System.out.println("\nMax element is : "+k);   
		}
	}

}
