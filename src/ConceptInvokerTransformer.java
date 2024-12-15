import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.InvokerTransformer;

public class ConceptInvokerTransformer {
    public static void main(String[] args) {
        try {
            // concept of InvokerTransformer
            User u = new User("abhijit", "sinha");
            System.out.println(u.toString());

            Transformer t = new InvokerTransformer(
                    "toString",  // method name
                    null,  // toString() parameter types
                    null  // toString() argument
            );
            String out = (String) t.transform(u);  // on `transform`, calls that toString() method of User object
            System.out.println(out);  // same as d.toString()

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
