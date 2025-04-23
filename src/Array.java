import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> cars = new ArrayList<Integer>();
        System.out.println("Enter five cars: ");
        for (int i = 0; i < 5; i++) {
            Scanner c = new Scanner(System.in);
            cars.add(c.nextInt());
        }
        System.out.println(cars);
        cars.add(0,12);
        System.out.println(cars.get(3));
        cars.set(1,33);
        System.out.println(cars);
        System.out.println(cars.size());
        cars.remove(0);
        System.out.println(cars);
//        cars.clear();
//        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        for (Integer car: cars) {
            System.out.println(car);
        }

        Collections.sort(cars, Collections.reverseOrder());
        for (Integer car: cars) {
            System.out.println(car);
        }

    }
}