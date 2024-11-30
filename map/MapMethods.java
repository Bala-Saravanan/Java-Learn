package map;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiFunction;

public class MapMethods {
	final static void sayHi() {

	}

	public static void main(String[] args) {

		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("student1", "poongodi");
		myMap.put("student2", "bala");
		myMap.put("student3", "praveen");
		myMap.put("student6", "ravi");
		System.out.println(myMap);
		Map<String, String> myMap2 = new HashMap<String, String>();
		myMap2.put("student3", "pavithra");
		myMap.putAll(myMap2);
		System.out.println(myMap);
		myMap.putIfAbsent("student6", "hello");
		System.out.println(myMap);
		Set<String> keys = myMap.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		System.out.println(myMap.get("student1"));
		Set<java.util.Map.Entry<String, String>> h = myMap.entrySet();
		for (Entry<String, String> obj : h) {
			System.out.println(obj);
		}
		System.out.println(myMap.containsValue("bala"));
		System.out.println(myMap.get("student2"));
		myMap.remove("student3");
		System.out.println(myMap);
		BiFunction<String, String, String> bi = new BiFunction<String, String, String>() {
			@Override
			public String apply(String f, String s) {
				// TODO Auto-generated method stub
				return f + "this is new value";
			}
		};

		myMap.compute("student1", (key, value) -> {
			return value + " M";
		});
		myMap.computeIfAbsent("student10",(key) -> key+"hi");
		System.out.println(myMap);
//		System.out.println(ret);
//		System.out.println(a);

		BiFunction<String, Integer, String> emailFunc = (String username, Integer age) -> username + age + "@gmail.com";

		String email = emailFunc.apply("poongodi", 26);
		String email2 = emailFunc.apply("balasaravanan", 007);
		System.out.println(email2 + " email");
		System.out.println(email + ".this is email");

	}
}
