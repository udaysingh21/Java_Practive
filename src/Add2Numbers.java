//Add 2 Numbers by taking Input from user

import java.util.ArrayList;
import java.util.Scanner;

public class Add2Numbers {

    public int[] take_input() {
//        ArrayList<Integer> input = new ArrayList<Integer>();
        int[] input = new int[2];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number : ");
//        Integer x = obj.nextInt();
        input[0] = obj.nextInt();
//        input.add(x)
        System.out.println("Enter second number : ");
//        Integer y = obj.nextInt();
        input[1] = obj.nextInt();
//        input.add(y);
        obj.close(); // Closing the Scanner object

        return input;

    }

    public int Add(int x, int y) {
        return x + y;
    }


    public static void main(String[] args){
        Add2Numbers add = new Add2Numbers();
//        ArrayList<Integer> input = add.take_input();
        int[] input = add.take_input();
//        int x = input.get(0);
//        int y = input.get(1);

        int x = input[0];
        int y = input[1];

        System.out.println("Sum : " + add.Add(x,y));

    }
}


