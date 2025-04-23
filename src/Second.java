import java.util.Scanner;

public class Second {
    public static void first() {
        System.out.println("First Method");
    }

    public void second() {
        System.out.println("Second Method");
    }

    public static void main(String[] args){
        System.out.println("In Second class");
        Scanner myname1 = new Scanner(System.in);
        myname1.nextLine();
        Main obj = new Main(100,myname1);
        Main obj1 = new Main(110,myname1);
        obj.x=125;
        System.out.println(obj.x);
        System.out.println(obj1.x);
        System.out.println(obj.name);

        first(); // static - method of class so directly called
        Second obj2 = new Second();
        obj2.second(); // non - static , method of object , so called via obj2

        System.out.println("--------------------------------------------------");

        Practice myobj = new Practice(); // making an object of Practice class which extends Demo class which is an abstract class
        System.out.println(myobj.age);
        System.out.println(myobj.name);
        myobj.study();

    }
}
