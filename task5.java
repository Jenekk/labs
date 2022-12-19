import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        int[] arr= new int[10];
        Random rand = new Random();
        for(int i=0; i< arr.length;i++){
            arr[i]=rand.nextInt(5);
        }
        for(int i=0; i< arr.length;i++){
            System.out.println(" "+arr[i]);
        }
      System.out.println(findElement(arr));
    }
       public static int findElement(int[] array) {
            bubbleSort(array);
            int counter = 1; //counts the occurences

            int min_occ=100; //minimum occurences
    /*here put a starting value that is high relatively to the times a
    number is in the matrix*/

            int num=array[0]; //the number that we want
            //start with 0 index in case the array has 1 element
            for (int i = 0; i <= array.length - 1; i++) {
                if (i == array.length - 1) { //avoid out of bounds exc
                    if (array[i]!=array[i-1]) {
                        num=array[i]; //in case it is one in last position
                        min_occ=1;
                    }
                    else { //in case it is multiple times in last positions of array
                        if (counter < min_occ) {
                            min_occ=counter;
                            num = array[i];
                        }
                    }
                    break;
                }
                if (array[i] == array[i + 1]) {
                    counter++;
                }
                else {
                    if (counter < min_occ) {
                        min_occ=counter;
                        num = array[i];
                    }
                    counter=1;
                }
            }
            System.out.println("Amount of min : "+min_occ+" times");
            //helped me see how many times the element was in the array
            return num;
        }
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
