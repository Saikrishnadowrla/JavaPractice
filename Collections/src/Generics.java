import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		
		int i = list.get(0);   // no need to type casting here using generics
		System.out.println(i);
	}
}
