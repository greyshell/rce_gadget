import org.apache.commons.collections.bag.HashBag;
import org.apache.commons.collections.keyvalue.TiedMapEntry;
import org.apache.commons.collections.map.LazyMap;

import java.util.HashMap;
import java.util.Map;

public class ConceptHashBag {
    public static void main(String[] args) {
        try {
            // understanding HashBag
            Map dict = new HashMap();
            dict.put("asinha", 9);
            Map lazymap = LazyMap.decorate(dict, new MyReverse());  // chainedTransformer.transform() will be called

            String invalid_key = "invalid_key";
            String valid_key = "asinha";

            // Create a TiedMapEntry with the underlying map as our `lazyMap` and an invalid key
            TiedMapEntry tiedmapentry = new TiedMapEntry(lazymap, invalid_key);
            // if we try to print can't tiedmapentry object here then it calls hashcode() method and due to invalid key
            // it finally calls the transform method
            // System.out.println(tiedmapentry);


            HashBag b = new HashBag();
            b.add(tiedmapentry);  // tiedmapentry.hashcode() -> lazymap.get(invalid_key) -> transform()

            System.out.println("map_obj: " + dict);  // a new entry is added to the underlying HashMap of tiedmapentry object
            System.out.println("tidemapentry_obj: " + tiedmapentry);  // println() internally called tiedmapentry.hashcode() and key is found

            // due to this invalid_key=yek_dilavni is printed instead of {invalid_key=yek_dilavni, sarvesh=10, asinha=9}

            // hashbag format => count: object
            System.out.println("hashbag_obj: " + b);  // key=obj_count, value=Object(for example: tidemapentry_obj)

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}