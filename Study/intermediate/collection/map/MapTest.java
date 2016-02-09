package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.dog.Dog;

public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Dog> hm=new HashMap<String, Dog>();
		hm.put(null, null);
		hm.put(null, null);
		hm.put("haba", new Dog("haba"));
		hm.put("ben", new Dog("ben"));
		Set<String> ss=hm.keySet();
		for(String p:ss){
			System.out.println(p);
		}
		Set<Entry<String, Dog>> set=hm.entrySet();
		Iterator<Entry<String, Dog>> it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getKey());
		}
		System.out.println(hm.get("ben"));
	}

}
