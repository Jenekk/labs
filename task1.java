//Найдите значение функции: z = ((a-3)*b/2)+c
import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        System.out.println("a >> ");
        Scanner sc1 = new Scanner(System.in);
        int a=sc1.nextInt();
        System.out.println("b >> ");
        Scanner sc2=new Scanner(System.in);
        int b = sc2.nextInt();
        System.out.println("c >> ");
        Scanner sc3=new Scanner(System.in);
        int c=sc3.nextInt();
        int z;
        z = ((a-3)*b/2)+c;
        System.out.println("z=((a-3)*b/2)+c= "+z);
    }
}
