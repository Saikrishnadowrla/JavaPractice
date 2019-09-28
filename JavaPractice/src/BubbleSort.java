import java.util.Random;

public class BubbleSort {
	public static void main(String args[])
	{
		int a[] = new int[100];
		Random r=new Random();
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					c=a[j];
					a[j]=a[i];
					a[i]=c;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + ",");
		}
	}
}
