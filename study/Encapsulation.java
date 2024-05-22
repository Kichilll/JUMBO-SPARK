package study;
/*
public class Encapsulation{
//encapsulated string
private String name;

//getter
public String getName(){
    return name;
}

//setter
public void setName(String newName){
this.name = newName;
}
    public static void main(String[] args) {
     Encapsulation Person1 = new Encapsulation();
     Encapsulation Person2 = new Encapsulation();
     Encapsulation Person3 = new Encapsulation();   
     Person1.name = "Maxwell";
     Person2.name = "Agyiri";
     Person3.name = "Mensah";
     System.out.println("My name is "+ Person1.name +" " + Person2.name +" "+ Person3.name );
    }
}

public class Encapsulation{

    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public static void main(String[] args) {
        Encapsulation myAge = new Encapsulation();
        myAge.age = 44;
        System.out.println("My age is "+myAge.age);
    }
}
*/



public  class Encapsulation{

    //private access modifier
    private double height = 5.99;

    //getter
    public double getHeight(){
        return height;
    }

    // setter
    public void setHeight(double newHeight){
        this.height = newHeight;
    }

    public static void main(String[] args) {
        Encapsulation myHeight = new Encapsulation();
        System.out.println("i have a height of "+myHeight.height);
    }
}