import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String args[])
	{
		Map<String,String> map = new HashMap();
		map.put("First name","Sai");
		map.put("Last name","krishna");
		map.put("sub","Selenium");
		map.put("location","hyd");
		System.out.println(map);
		System.out.println(map.get("First name"));
		System.out.println(map.size());
		Set<String> keys = map.keySet();
		for(String key:keys)
		{
			System.out.println("key is ->"+key+"value is ->"+map.get(key));
		}
	}
}
