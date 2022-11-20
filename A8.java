package arrays;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		int[] a={10,20,30,40,50};
		Scanner s=new Scanner(System.in);
		System.out.println("enter the key elements");
		int key=s.nextInt();
		int count=0;
		int low=0;
		int high=4;
		while(high>=low)
		{
			int mid=(low+high)/2;
			if(a[mid]==key)
			{
				count++;
				break;
			}
			else if(a[mid]<key)
			{
				low=mid+1;
			}
			else 
				high=mid-1;
		}
		if(count==1)
			System.out.println("key is found");
		else
			System.out.println("key is not found");

	}

}
