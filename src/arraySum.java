import java.util.ArrayList;
import java.util.Scanner;

public class arraySum {

    public ArrayList<Integer> sumArray() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = scn.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Enter "+ (i+1) +" number : ");
            array.add(scn.nextInt());
        }
        scn.close();
        return array;
    }

    public static void main(String[] args) {
        arraySum obj = new arraySum();
        ArrayList<Integer> arr = obj.sumArray();

        int sum = 0;
        for (int i = 0; i < arr.size() ; i++) {
            sum += arr.get(i);
        }

        System.out.println("Sum : " + sum);

    }
}
