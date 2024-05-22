package inheritance;

public class Cars extends Vehicle {
    private String modelName;

    public static void main(String[] args) {
        Cars benz = new Cars();
        benz.hHonk();
    }

}
