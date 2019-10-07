import java.util.Random;

public class MultiplesOfSixty {
		public static void main(String[] args) {
			Random r = new Random();
			int k=0;
			int count=0;
			int a[] = new int[10];
			for(int i=0;i<a.length;i++)
			{
				a[i] = r.nextInt(200);
				System.out.print(a[i] + ",");
			}
			System.out.println();
			for(int i=0;i<a.length-1;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					k = a[i]+a[j];
					if(k%60 ==0)
					{
						
						System.out.println("Number pair:" + a[i]+","+a[j]+"");
						count++;
					}					
				}
			}
			System.out.println();
			System.out.println("No:of pairs :" + count);
		}
}
