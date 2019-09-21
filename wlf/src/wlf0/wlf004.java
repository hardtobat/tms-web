package wlf0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class wlf004 {

	public static void main(String args[]){
		
		List<Map<String, Object>>	 list = new ArrayList();
		//list.add(ss);
		Map map = new HashMap();
		Map map1 = new HashMap();
		Map map2 = new HashMap();
		map.put("chinses", "123");
		map1.put("chinses", "234");
		map2.put("chinses", "456");
		list.add(map);
		list.add(map1);
		list.add(map2);
		System.out.println(list.get(0).get("chinses"));
		System.out.println(list.size());
		//System.out.println(list.get(0));
		
		for(int i=0;i<list.size();i++){
			
			System.out.println(list.get(i).get("chinses"));
			
		}
		
		Integer.parseInt("123");
		
		String s1 = "123456";
		String s2 = "123";
		
		
		
	
		
		//{ROSTERVALUEID=1119860}, {ROSTERVALUEID=1119861}, {ROSTERVALUEID=1119862}, {ROSTERVALUEID=1119863}, {ROSTERVALUEID=1119864}, {ROSTERVALUEID=1119865};

	}
	
}
