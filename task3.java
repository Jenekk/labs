import java.util.Scanner;


public class task3 {
    public static void main(String[] argc){
        System.out.println("(x=");
        Scanner sc1= new Scanner(System.in);
        float x = sc1.nextFloat();
        System.out.println("y= ");
        Scanner sc2= new Scanner(System.in);
        float y = sc2.nextFloat();
        System.out.println(")");
            if ((x < 2) && (x > -2)) {
                    if ((y < 4) && (y > -3)){
                        if ((x>-0.5)&&(x<0.5))
                        System.out.println("false");
                        else if ((y>-1.5)&&(y<-0.5))
                            System.out.println("false");
                        else
                            System.out.println("true");
                    }
                    else
                        System.out.println("false");}
           else if ((x < 4) && (x > -4)) {
               if((y>=-3)&&(y<=0))
                            System.out.println("true");
               else
                   System.out.println("false");
           }
           else
                System.out.println("false");
    }
}