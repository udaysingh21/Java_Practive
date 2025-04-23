public class Add {
    public static int addN(int n){
        if (n<=1) {
            return n;
        }

        return n+addN(n-1);
    }

    public static int addRange(int n, int m){
        if (n >= m) {
            return n;
        }
        return n + addRange(n+1,m);

    }

    public static void main(String[] args){
        System.out.println(addN(10));
        System.out.println(addRange(1,10));
    }
}
