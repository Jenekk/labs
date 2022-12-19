import java.util.Random;
import java.util.Scanner;

public class task14 {
    public static void main(String[] args){
        int n = 10;
        Student students[] = new Student[n];

        students[0] = new Student("Petrov", "Sergey", 7);
        students[1] = new Student("Sidorov", "Pasha", 7);
        students[2] = new Student("Nikivorenko", "Viktoria", 7);
        students[3] = new Student("Gotovko", "Vlad", 7);
        students[4] = new Student("Rudinskiy", "Egor", 6);
        students[5] = new Student("Evmenova", "Anastasia", 6);
        students[6] = new Student("Cheshko", "Uliana", 6);
        students[7] = new Student("Sazonov", "Igor", 8);
        students[8] = new Student("Anisovich", "Uliana", 8);
        students[9] = new Student("Lukin", "Danik", 8);

        Random rnd = new Random();
        for (int i = 0; i < n; ++i) {
            students[i].addGrade(rnd.nextInt(6) + 5);
            students[i].addGrade(rnd.nextInt(6) + 5);
        }

        System.out.println("All students: ");
        for (int i = 0; i < n; ++i) {
            students[i].print();
        }
        System.out.println(" ");
        System.out.println("Best students: ");
        for (int i = 0; i < n; ++i) {
            if (students[i].best())
                students[i].print();
        }
    }
}

class Student{
    private String surname;
    private String name;
    private int group;
    private int grades[];
    private int count;

    public Student(String surname_, String name_, int group_){
        surname = surname_;
        name = name_;
        group = group_;
        count = 0;
        grades = new int[5];
    }

    boolean addGrade(int grade){
        if (count >= 5) {
            return false;
        }
        grades[count] = grade;
        count++;
        return true;
    }

    boolean best(){
        for (int i = 0; i < count; ++i)
                if (grades[i] != 9 && grades[i] != 10){
                    return false;
                }
        return true;
    }

    void print(){
        System.out.println(surname + " " + name);
        System.out.print(". Group: " + Integer.toString(group) + ". Grades: ");
        for (int i = 0; i < count; ++i)
            System.out.print(Integer.toString(grades[i]) + " ");
        System.out.print("\n");
    }
}