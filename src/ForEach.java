public class ForEach {
    public static void myMethod(String[] cars){
        for (String car: cars){ // for (dataType var :  iterable)
            System.out.println(car);
        }
    }

    public static void  main(String[] args){
        System.out.println("Inside the main method");
        String[] cars = {"A","B","C","D"};
        myMethod(cars);
        myMethod(cars);
    }
}
