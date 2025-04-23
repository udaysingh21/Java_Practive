import java.util.HashMap;

public class Practices {
    public static void main(String[] args) {
       HashMap<String, String> capital = new HashMap<String, String>();

       capital.put("U.P.","Lucknow");
       capital.put("Karnataka","Bangalore");
       capital.put("Telangana","Hyderabad");
       System.out.println(capital);
       System.out.println(capital.get("Telangana"));
       System.out.println(capital.remove("Telangana"));
        System.out.println(capital.size());

        for (String state: capital.keySet()) {
            System.out.println(state);
        }
        for (String state: capital.values()) {
            System.out.println(state);
        }
        for (String state: capital.keySet()) {
            System.out.println(state + " " + capital.get(state));
        }
        capital.clear();
        System.out.println(capital);
    }

}
