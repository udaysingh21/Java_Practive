public class PosOrNeg {

    public String checkSign(int num) {
        if (num > 0) {
            return "Number is positive";
        } else if (num == 0) {
            return "Number is Zero";
        } else {
            return "Number is negative";
        }
    }

    public static void main(String[] args) {
        PosOrNeg obj = new PosOrNeg();
        System.out.println(obj.checkSign(0));
    }
}
