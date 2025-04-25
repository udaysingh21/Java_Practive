import java.util.HashMap;

public class LoopHash {

    public static void main(String[] args) {
        HashMap<String,Integer> marks = new HashMap<String,Integer>();
        marks.put("Uday Vikram Singh",100);
        marks.put("Anubhav Yadav",95);
        marks.put("Prakhar Nigam",92);
        marks.put("Anand Kumar",90);

        for (String name : marks.keySet()) {
            System.out.println(name);
        }

        for (Integer mark : marks.values()) {
            System.out.println(mark);
        }

        for (String name : marks.keySet()) {
            System.out.println(name + " scored " + marks.get(name));
        }
    }
}
