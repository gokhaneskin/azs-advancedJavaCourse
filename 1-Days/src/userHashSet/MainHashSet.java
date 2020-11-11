package userHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainHashSet {

	public static void main(String[] args) {
		Set<String> hashSet= new HashSet<>();
		hashSet.add("Gokhan");
		hashSet.add("Gokhan");
		hashSet.add("Mehmet");
		hashSet.add("Kemal");
		hashSet.add("Zehra");
		System.out.println(hashSet);
		System.out.println("############################");
		//Nesnedeki eleman� kopar�p yazar
		Iterator<String> iterator = hashSet.iterator();
		iterator.forEachRemaining(item->{
			System.out.println("item - "+item);
		});
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}