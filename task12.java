import java.util.Scanner;

public class task12 {
    public static void main(String[] args){
        Test1 obj = new Test1();
        System.out.println(">>");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        System.out.println(">>");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc1.nextInt();
        obj.num1 = num1;
        obj.num2 = num2;
        System.out.println("max = "+ obj.max());
        System.out.println("sum = "+ obj.sum());

    }
}

class Test1{
    public int num1, num2;
    public int max(){
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public int sum(){
        return num1 + num2;
    }
}

