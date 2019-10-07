
public class DuplicateValues {
	
	
		
	public static void main(String args[])
	{
	int a[] = {20, 20, 30, 40, 50, 50, 50,60,60,70,70};
	int b=0;
	for(int i=0;i<a.length-1;i++) 
	{
	for(int j=i+1;j<a.length;j++) 
	{
		if(i==0&&a[j]==0) {
			b=1;
		}
		if(a[i]==a[j]) {
			a[j]=0;
		}
	}
	
	
	}
	for(int i=0;i<a.length-1;i++) 
	{
		if(a[i]!=0) {
			b++;
			System.out.print(a[i]+" ");
		}
		
	}
	System.out.println(" ");
	System.out.println(b);
	
	}
}
