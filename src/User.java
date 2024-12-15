public class User {
    private final String first_name;
    private final String last_name;


    public User(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    // System.out.println(user_obj) -> calls the Strings.toString() method
    public String toString() {
        return first_name + " : " + last_name;
    }

}