package TestCollection.in;

import java.util.*;
public class MapTest {

	public static void main(String[] args) 
		{
			HashMap<String,String> map=new HashMap<>();
			
			map.put("Mike","Apple");
			map.put("jaan","Grape");
			map.put("Nagshekar","Orange");
			if(map.containsKey("jaan"))
			{
				String s=map.get("jaan");
				System.out.println("Favourite fruit is:  "+s);
			}
			//map.keySet();
			//map.entrySet();
		}

}


