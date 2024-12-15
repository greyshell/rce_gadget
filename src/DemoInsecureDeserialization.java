import java.io.*;

public class DemoInsecureDeserialization {

    public static void main(String[] args) {
        try {
            // enable the unsafe serialization
            System.setProperty(
                    "org.apache.commons.collections.enableUnsafeSerialization",
                    "true");

            String file_name = "rce_serialized_object.ser";

            FileInputStream fin = new FileInputStream(file_name);
            ObjectInputStream oin = new ObjectInputStream(fin);

            User user = (User) oin.readObject();  // actual deserialization process starts here
            oin.close();
            fin.close();
            System.out.println("The object was read from " + file_name);
            System.out.println(user);
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}