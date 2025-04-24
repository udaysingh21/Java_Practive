public class EvenOrOdd {

    public boolean isEvenOrOdd(int num) {
//        return num%2==0? true : false;
        return num%2==0;
    }

    public static void main(String[] args) {
        EvenOrOdd obj = new EvenOrOdd();
        boolean even = obj.isEvenOrOdd(5);
        if (even) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }
}
