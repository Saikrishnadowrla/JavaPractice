import java.util.Random;

public class Bubble {
	public static void main(String args[])
	{
		int a[] = {7,9,4,3,2};
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
