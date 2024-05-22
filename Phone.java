public class Phone{

    public static void main(String[] args) {
        String[]names = {"Maxwell","Yaw","Kofi","Kojo"};
        int[]age = {24,34,51,21,};
        double[]height = {2.2,2.3,2.4,2.5,};
        
        for(int i = 0; i < names.length;i++ ){
            System.out.println("Name: "+names[i]+ " ");
            System.out.println("Age: "+age[i] + " ");
            System.out.println("Height: "+height[i]+ " ");
        }
    }
}