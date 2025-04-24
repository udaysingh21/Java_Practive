import java.util.Scanner;

public class arrayAverage {

    public double average(int[] arr) {
        int n = arr.length;
        double total = 0;
        double avg = 0;

        for(int i = 0; i<n; i++) {
            total+=arr[i];
        }

        avg = total /n;
        return avg;
    }

    public static void main(String[] args) {
        arrayAverage obj = new arrayAverage();
        int[] arr = {1,2,3,4,13};

        System.out.println("Avergae is : "+ obj.average(arr));
    }
}
