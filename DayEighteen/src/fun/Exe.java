package fun;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exe {

	public static void main(String[] args) {

		Map<Integer, String> mymap = new HashMap<>();
		mymap.put(1, "kothisuppi");
		mymap.put(2, "varshini");
		mymap.put(3, "gowtham");
		mymap.put(4, "dummu");
		System.out.println(mymap);
		System.out.println(mymap.get(3));
		System.out.println(mymap.entrySet());
		Set<Entry<Integer, String>> seto = mymap.entrySet();
		System.out.println(seto);
		Iterator<Entry<Integer,String>> ito = seto.iterator();
		while (ito.hasNext()) {
			Entry<Integer,String> silly = ito.next();
			System.out.print("this is a key "+silly.getKey()+" ");
			System.out.println("the value is "+silly.getValue().toUpperCase()+"");

			
		}
		Set see = mymap.keySet();
		Iterator<Integer> ino = see.iterator();
		while(ino.hasNext()) {
			System.out.println(mymap.get(ino.next()));
		}
		
		for(Integer lolo : mymap.keySet()) {
			System.out.println(mymap.get(lolo));
		}
		
		
	}

}
