package map;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Basic operations
        map.put("One", 1);
        map.put("Two", 2);
        System.out.println("Map: " + map);

        System.out.println("Value for 'One': " + map.get("One"));
        System.out.println("Contains key 'Two': " + map.containsKey("Two"));
        System.out.println("Contains value 2: " + map.containsValue(2));

        map.remove("One");
        System.out.println("After removal: " + map);

        // Advanced operations
        map.putIfAbsent("Three", 3);
        map.compute("Two", (k, v) -> v + 10);
        System.out.println("After compute: " + map);

        // Iterating over entries
        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}

