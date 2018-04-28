import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, String>hm = new HashMap();
		
		hm.put("Name", "Manoj");
		hm.put("email", "Manoj@gmail.com");
		hm.put("add", "somme");
		hm.put("suburb", "ED");
		hm.put("postcode", "2174");

		Set s=hm.keySet();
		
		for (Object o: s) {
			System.out.print("\n key \n"+o);
			System.out.println(" - "+hm.get(o.toString()));
		}
		
		
		for (Object o: s) {
			System.out.print("\n key \n"+o);
			System.out.println(" - "+hm.get(o.toString()));
		}
		
		System.out.println("Entry");
		for (Entry e : hm.entrySet()) {
			System.out.println(e);
			
		}
		
		
		
	}

}
