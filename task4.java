import java.util.Scanner;

public class task4 {
    public static void main(String[] argc){
        System.out.println("x>>");
        Scanner sc1 = new Scanner(System.in);
        float x = sc1.nextFloat();
        System.out.println("y>>");
        Scanner sc2 = new Scanner(System.in);
        float y = sc2.nextFloat();
        double z;
        z= (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
        System.out.println("= " +z);
    }
}
