import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestConsecutive {

	public static void main(String[] args)
	{
		int count=1;
		int a[] = {49, 1, 3, 200, 2, 9, 6, 7, 70, 8};
		Arrays.sort(a);
		int max=0;
		for(int i =0;i<a.length;i++)
		{
		System.out.print(a[i] + " ");
		}
		for(int i =0;i<a.length-1;i++)
		{
				if((a[i+1] - a[i]) ==1)
				{
					count++;
					
				}
				else
				{
					if(max<count)
					{
						max=count;
					}
					count=1;
				}			
		}
		System.out.println(" ");
		System.out.print(max + " ");
		
	}
}
