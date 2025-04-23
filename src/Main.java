import java.util.Scanner;
public class Main {
    int x;
    String name;

//    Constructor
    public Main(int xval, Scanner myname) {
        x = xval;
        this.name = String.valueOf(myname);
    }

    public static void main(String[] args) {
        Scanner myname = new Scanner(System.in);
        myname.nextLine();
        Main obj = new Main(100,myname);
        System.out.println(obj.name);
        System.out.println(obj.x);
    }
}