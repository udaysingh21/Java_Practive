public class SmallestElement {

    public int smallest(int[] arr) {
        int smallest = arr[0];

        for(int i=1; i<arr.length; i++) {
            if (arr[i]<smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        SmallestElement obj = new SmallestElement();
        int[] arr = {1,2,163,-493,-5};
        if (arr.length != 0) {
            System.out.println("Smallest element in array : "+obj.smallest(arr));
        }


    }
}
