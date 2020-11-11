package userHashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainHashMap {

	public static void main(String[] args) {
		Map<String, Object> hm=new HashMap<>();
		hm.put("name","Ali");
		hm.put("name","Veli");
		hm.put("age",40);
		System.out.println(hm);
		System.out.println(hm.get("name"));
		
		Set<String> keys=hm.keySet();
		for (String key : keys) {
			System.out.println(key+ "- Value - "+ hm.get(key).getClass().hashCode());
		}
		System.out.println("#################################");
		Set<Entry<String, Object>> entries = hm.entrySet();
		for (Entry<String, Object> entry : entries) {
			System.out.println("Entry "+ entry.getKey()+ " - "+ entry.getValue());
		}
		System.out.println("#################################");
		
		System.out.println("#################################");
		Collection<Object> values = hm.values();
		for (Object object : values) {
			System.out.println(object);
		}
		System.out.println("#################################");
		System.out.println("#################################");
		List<HashMap<String, Object>> hashMaps= new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			HashMap<String, Object> map=new HashMap<>();
			map.put("name", "Ali"+ i);
			map.put("surname", "Veli"+ i);
			map.put("number",  i);
			hashMaps.add(map);
		}
		System.out.println(hashMaps);
		System.out.println("#################################");
		System.out.println("#################################");
		//Enum Map
		Map<EMap, Object> enumMap= new HashMap<>();
		enumMap.put(EMap.name, "Gokhan");
		enumMap.put(EMap.mail, "gokhan@asd.com");
		enumMap.put(EMap.status, true);
		System.out.println(enumMap);
		System.out.println(enumMap.get(EMap.name));
		System.out.println("#################################");

	}
}
