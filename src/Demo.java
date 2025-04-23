abstract public class Demo {
    public String name = "Uday Vikram Singh";
    public int age = 18;
    public abstract void study(); // abstract class - only declared here , will be implemented later.
}

class Practice extends Demo {
    public int gr_year = 2018;
    public void study() {
        System.out.println("I am studying...");
    }
}