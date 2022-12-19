import java.util.Scanner;

//В строке найти количество цифр.
public class task10 {
    public static void main(String[] args){
        System.out.println(">>");
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.nextLine();
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (Character.isDigit(str1.charAt(i))) {
                count++;
            }
        }
        System.out.print(count);
    }
}

