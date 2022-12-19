import java.util.Scanner;
//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//STRING
public class task9 {
    public static void main(String[] args){
        System.out.println(">>");
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.nextLine();
        String str2 = "   hello  ";
        System.out.println(str2);
        String after = str1.trim().replaceAll(" +", " ");
        String after2 = str2.trim().replaceAll(" +", " ");
        System.out.println(after);
        System.out.println(after2);
    }

}
