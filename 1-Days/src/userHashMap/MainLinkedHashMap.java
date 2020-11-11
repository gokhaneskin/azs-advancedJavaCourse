package userHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainLinkedHashMap {

	public static void main(String[] args) {
		Map<EMap, Object> linkedHashMap= new LinkedHashMap<>();
		linkedHashMap.put(EMap.name, "Gokhan");
		linkedHashMap.put(EMap.surname, "Eskin");
		linkedHashMap.put(EMap.status, true);
		linkedHashMap.put(EMap.mail, "gokhan@com.com");
		System.out.println(linkedHashMap);
		System.out.println("############################");
	}
}
