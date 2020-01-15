import java.util.HashMap;

public class HashMapDemo01 {

	public static void main(String[] args) {// We'll start by defining a hash map
		HashMap<String, String> usernames = new HashMap<>();
		// Why are the objects in the brackets there? What do they mean?

		// and putting some data into it
		usernames.put("Thomas", "twolfe@gmail.com");
		usernames.put("Marget", "mmitchell@yahoo.com");
		usernames.put("Ayn", "arand@reagan.com");
		usernames.put("Stephen", "sking@clowns.com");

		System.out.println("usernames: " + usernames);
		// Notice the auto formatting from the toString method.

//		// obtaining values from the hash map by key
//		System.out.println("\n\tvalues from the hash map by key");
//		System.out.println("usernames.get(\"Thomas\"): " + usernames.get("Thomas")); // "?
//		System.out.println("usernames.get(\"Phillip\"): " + usernames.get("Phillip")); // ?
//		System.out.println(
//				"usernames.getOrDefault(\"Jason\", \"not found\"): " + usernames.getOrDefault("Jason", "not found")); // ?
//
//		// checking if keys or values are present
//		System.out.println("\n\tchecking if keys or values are present");
//		System.out.println("usernames.containsKey(\"Stephen\"): " + usernames.containsKey("Stephen")); // ?
//		System.out.println(
//				"usernames.containsValue(\"arand@reagan.com\"): " + usernames.containsValue("arand@reagan.com")); // ?
//		System.out.println(
//				"usernames.containsValue(\"Fread@reagan.com\"): " + usernames.containsValue("Fread@reagan.com")); // ?

	}

}
