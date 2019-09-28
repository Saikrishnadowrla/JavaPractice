import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
public static void main(String args[])
{
	ArrayList list = new ArrayList();
	System.out.println(list);
	System.out.println(list.size());
	list.add(10);		//autoboxing 
	list.add("Sai");
	list.add('s');
	list.add(true);
	list.add(null);
	list.add("Sai");
	System.out.println(list);
	System.out.println(list.size());
	// how to fetch the values from the list
	System.out.println(list.get(0));
//	
	// remove value from the list
	list.remove(4);
	System.out.println(list);
	System.out.println(list.size());
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
	
	// using for each 
//	for(Object var:list) {
//	System.out.println(var);
//	}
	Iterator itr = list.iterator(); 
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	int var = (Integer)list.get(0);
	System.out.println(20+var);
}
}
