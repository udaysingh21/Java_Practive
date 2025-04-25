import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] marks = {82,0,23,34,-1,89};
        String[]  name = {"uday", "anubhav", "yash"};

        Arrays.sort(marks);
        Arrays.sort(name);

        for (int mark : marks) {
            System.out.println(mark);
        }

        for (String n : name) {
            System.out.println(n);
        }

    }
}
