package Chapter11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap01 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("깁자바", new Integer(90));
		map.put("깁자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("인자바", new Integer(90));
	
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("이름 : "+e.getKey() + ",  점수 : " +e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : "+ set);
		
		Collection value = map.values();
		it = value.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(value));
		System.out.println("최저점수 : " + Collections.min(value));



	}

}
