import java.util.HashMap;

public class test {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 3);
		map.put(5, 7);
		map.put(2, 4);
		
		System.out.println(map);
		System.out.println(map.containsKey(3));
		
		System.out.println(map.containsValue(5));
		System.out.println(map.get(5));
		System.out.println(map.get(3));
		System.out.println(map.getOrDefault(3, 3));
		
		
	}
}
