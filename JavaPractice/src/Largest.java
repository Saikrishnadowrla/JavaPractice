import java.util.Arrays;

public class Largest {
	public static void main(String args[])
	{
		int a[]= {2,8,6,4,9};
		Arrays.sort(a);
		
			System.out.println("Second largest in array :" + a[1]);
			System.out.print("Smallest in array :" + a[a.length-2]);
		
	}
}
