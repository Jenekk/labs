import java.util.Scanner;
//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".
public class task11 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.nextLine();
        str1 = str1.replaceAll("\\s+","");
        System.out.println(str1);
        char[] arr = str1.toCharArray();
        sort(arr);
        System.out.println("///");
        str1 = str1.copyValueOf(arr);
        System.out.println(str1);
    }
    static void sort(char items[]){
        quicksort(items, 0, items.length-1);
    }
    private static void quicksort(char items[], int left, int right){
        int top, bottom;
        char comparand, value;

        top=left;
        bottom=right;
        comparand = items[((left + right)/2)];

        do{
            while ((items[top] < comparand) && (top < right))
                top++;
            while((comparand < items[bottom]) && (bottom > left))
                bottom--;
            if (top <= bottom){
                value = items[top];
                items[top] = items[bottom];
                items[bottom] = value;
                top++;
                bottom--;
            }
        }
        while (top <= bottom);

        if(left < bottom) quicksort(items, left, bottom);
        if(top < right) quicksort(items, top, right);
    }
}

