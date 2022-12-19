/*Задана матрица неотрицательных чисел.
Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.*/
import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Square matrix dimension: ");
        int n = sc.nextInt();
        int m = n;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter the matrix element: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix: ");
        printValueArr(arr);
        maxSumColumn(arr);
    }

    public static void maxSumColumn(int[][] table) {
        int sum = 0;
        int num =0;
        for (int x = 0; x < table[0].length; x++) {
            int count = 0;
            for (int y = 0; y < table.length; y++) {
                count += table[y][x];
            }
            if(sum<count) {
                num++;
            }
            sum = Math.max(sum,count);


        }
        System.out.println("Largest sum of columns: "+sum);
        System.out.println("Number of column: "+num);
    }

    private static void printValueArr(int[][] arrTarget) {
        for (int[] row : arrTarget) {
            for (int val : row)
                System.out.printf("%4d", val);
            System.out.println();
        }
    }
}


