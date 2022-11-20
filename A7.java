package arrays;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		System.out.println("enter the size of an array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter the elements of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the key elements");
		int key=s.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				count=1;
				break;
			}
		}
		if(count==0)
			System.out.println("key is not found");
		else
			System.out.println("key is found");
			
	}

}
