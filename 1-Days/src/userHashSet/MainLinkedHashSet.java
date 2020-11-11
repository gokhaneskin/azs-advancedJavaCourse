package userHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainLinkedHashSet {

	public static void main(String[] args) {
		
		Set<String> hashSet= new LinkedHashSet<>();
		hashSet.add("Gokhan");
		hashSet.add("Gokhan");
		hashSet.add("Mehmet");
		hashSet.add("Kemal");
		hashSet.add("Zehra");
		System.out.println(hashSet);
		System.out.println("############################");
		//Nesnedeki elemaný koparýp yazar
		Iterator<String> iterator = hashSet.iterator();
		iterator.forEachRemaining(item->{
			System.out.println("item - "+item);
		});
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
