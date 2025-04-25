public class LoopEnum {

    enum LIFE {
        birth,
        sorrow,
        death
    }

    public static void main(String[] args) {

        for (LIFE x : LIFE.values()) {
            System.out.println(x);
        }
    }
}
