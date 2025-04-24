import java.util.Scanner;

public class CountWords {

    public int countWords(String words) {
        String[] word = words.trim().split("\\s+"); // removing leading/trailing space along with extra tap, space in b/w
        System.out.println(words);
        return word.length;
    }

    public static void main(String[] args) {
        CountWords obj = new CountWords();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String words = scn.nextLine();
        int length = obj.countWords(words);
        System.out.println("Number of Words : "+length);
        scn.close();
    }
}
