package arrays;

public class A10 {

	public static void main(String[] args) {
		int[][] a=new int[2][3];
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=10;
		a[1][1]=20;
		a[1][2]=10;
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][i]);
			}
		}

	}

}
