import java.util.*;
public class classlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> classlist = new HashMap<String,String>();
		classlist.put("Bob", "A");
		classlist.put("mary", "C");
		classlist.put("Sarah", "B");
		classlist.put("Philip", "A");
		classlist.put("Grey", "F");
		
		Iterator<Map.Entry<String, String>> entries = classlist.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<String, String> entry = entries.next();
			System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

	}

}
