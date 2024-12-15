import java.util.HashMap;

public class ConceptHashMap {
    public static void main(String[] args) {
        try {
            // understanding HashMap
            HashMap<String, Integer> h = new HashMap<String, Integer>();
            // Map<String, Integer> h = new HashMap<String, Integer>();  // we can write this also
            h.put("asinha", 9);
            h.put("bob", 2);
            // inspect  the HashMap object status
            System.out.println(h);

            System.out.println(h.get("bob"));
            System.out.println(h.get("alice")); // returns null when NO key is found
            // inspect the HashMap object status
            System.out.println(h);  // note: when No Key is found, it does not generate any value / add the entry

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
