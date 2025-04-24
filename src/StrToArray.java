import java.util.Scanner;

public class StrToArray {

    public char[] convert(String str) {
        char[] arr = str.toCharArray();
        return arr;

    }

    public static void main(String[] args) {
        StrToArray obj = new StrToArray();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scn.nextLine();
        scn.close();
        System.out.println("String to Array");
        char[] arr = obj.convert(str);
        for (char i : arr) {
            System.out.println(i);
        }
    }
}
