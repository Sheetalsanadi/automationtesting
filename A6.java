package arrays;

import java.util.Scanner;

public class A6 {

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
		System.out.println("entered elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		}

	}
