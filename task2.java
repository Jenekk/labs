//Найти сумму квадратов первых ста чисел
public class task2 {
public static void main(String[] args){
    int sum=0;
    for(int i=0; i<=100;i++){
      sum = sum + i*i;
    }
System.out.println("Sum = "+sum);
}
}
