
public class EvenOdd {
		public static void main(String args[])
		{
			int a[]= {2,7,4,8,9,3,1,5,6};
			System.out.println("Even numbers");
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
					System.out.println(a[i]);
				}
			}
			System.out.println("odd numbers");
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2!=0)
				{
					System.out.println(a[i]);
				}
			}
			
		}
}
