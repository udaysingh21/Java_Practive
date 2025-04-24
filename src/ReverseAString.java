import java.util.Scanner;

public class ReverseAString {

    public String reverseString(String str) {
        int i = 0;
        String rev = "";

        while (i < str.length()) {
            rev = str.charAt(i) + rev;
            i+=1;
        }

        return rev;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = scn.nextLine();
        scn.close();

        ReverseAString revs = new ReverseAString();
        System.out.println("Reversed String : "+revs.reverseString(str));
    }
}
