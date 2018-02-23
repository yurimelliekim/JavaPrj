package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Wrapping {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(3);
		list.add(4);
		list.add(5);
		/*	for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));*/
	/*	Iterator it1 = list.iterator();
		while(it1.hasNext())
			System.out.println(it1.next());
		for(Object n:list)
			System.out.println(n);*/
		
		
		Set set = new HashSet();
		set.add(3);
		set.add(4);
		set.add(3);
		Iterator it =set.iterator();
		for(Object n:set)
			System.out.println(n);
		
		System.out.println();

		
		Map map = new HashMap();
		map.put("이름","길동");
		map.put("나이",11);
		map.put("주소","홍대");
		System.out.println(map.get("이름"));
		System.out.println(map.get("나이"));
		System.out.println(map.get("주소"));
		
		Set keySet = map.keySet();
		for(Object k : keySet) {
			System.out.println(k+":"+map.get(k));
		}
		
		
		
	}

}
