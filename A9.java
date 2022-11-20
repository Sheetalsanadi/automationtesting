package arrays;

public class A9 {

	public static void main(String[] args) {
		int[] a= {40,20,10,15,25};
		for(int j=0;j<a.length-1;j++)
		{
			for(int i=0;i<a.length-j-1;i++)
			{
				if(a[i]>a[i-1])
				{
					int temp=a[i];
					a[i]=a[i-1];
					a[i-1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
