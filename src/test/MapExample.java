package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new LinkedHashMap<>();
		map.put("1", "sumit");
		map.put(null, "test");
		map.put("2", "agrawal");
		map.put("1", "human");
		/*ArrayList<String> list = new ArrayList<String>(map.keySet());
		System.out.println(map.size());
		for (int i = 0; i < list.size(); i++) {

				String key = list.get(i);
		String value = map.get(key);

			System.out.println("key :" + key + " Value :" + value);
		}*/
 
		Set set = map.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			String key = (String) me.getKey();
			String value = (String)me.getValue();
			System.out.println("Key is "+ key + " " + "value is: " + value);
		}

	}

}
