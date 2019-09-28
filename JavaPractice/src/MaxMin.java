
public class MaxMin {
	public static void main(String args[])
	{
	
		int a[]= {4,9,6,4,-7,-8};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}

		}
		System.out.println("Maximum " + max);
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
				
			}
		}
		System.out.println("Minimum " + min);
	}
}
