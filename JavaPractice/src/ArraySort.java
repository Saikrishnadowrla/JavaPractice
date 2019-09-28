import java.util.*;

public class ArraySort {
//int a[]= new int[4];
	
	public static void main(String[] args) {

		int[] a={6,3,8,4,5,-2,-5};
		Arrays.sort(a);
		int i=a[0];
		System.out.println("Minimum =" + i);
		System.out.println("Maximum ="  + a[a.length-1]);
	}		
}