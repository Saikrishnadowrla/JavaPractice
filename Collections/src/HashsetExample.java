import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("sai");
		set.add("sameer");
		set.add("Raman");
		set.add("rahul");
		set.add("ramesh");
//		System.out.println(set);
//		for(String var:set)
//		{
//			System.out.println(var);
//		}
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
//			if(itr.next().equals("sai"))
//			System.out.println(itr.next());
			String var = itr.next();
			if(var.equals("sai"))
			System.out.println(var);
		}
	}

}
