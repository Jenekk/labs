import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        Train trains[] = new Train[n];

        trains[0] = new Train("Msk", 122, "12:42");
        trains[1] = new Train("Msk", 123, "12:45");
        trains[2] = new Train("Spb", 34, "23:08");
        trains[3] = new Train("Msk", 33, "12:42");
        trains[4] = new Train("Spb", 156, "05:44");
        while (true) {
            System.out.println(
                    "Choose item:" + "\n" +
                            "1. Number sorting" + "\n" +
                            "2. Train information by number" + "\n" +
                            "3. Destination sort" + "\n" +
                            "4. Train information" + "\n" +
                            "5. Exit" + "\n"
            );
            int choice = scanner.nextInt();
            if (choice == 5)
                break;
            if (choice < 1 || choice > 5) {
                System.out.println("An invalid menu item was selected, repeat the input.");
                continue;
            }
            switch (choice) {
                case 1:
                    Arrays.sort(trains, new Train.ByNumberComparator());
                    for (int i = 0; i < trains.length; ++i) {
                        System.out.print(i+1 + " ");
                        trains[i].print();
                    }
                    break;
                case 2:
                    System.out.println("Enter train number: ");
                    int pos = scanner.nextInt();
                    if (pos < 0 || pos >= trains.length)
                        System.out.println("The array element number is not valid");
                    else
                        trains[pos].print();
                    break;
                case 3:
                    Arrays.sort(trains, new Train.ByDestinationAndTimeComparator());
                    for (int i = 0; i < trains.length; ++i) {
                        System.out.print(i+1 + " ");
                        trains[i].print();
                    }
                    break;
                case 4:
                    for (int i = 0; i < trains.length; ++i) {
                        System.out.print(i+1 + " ");
                        trains[i].print();
                    }
                    break;
            }
        }
    }
}

    class Train {
        private String destination;
        private int number;
        private String departure_time;

        public Train(String destination_, int number_, String departure_time_) {
            destination = destination_;
            number = number_;
            departure_time = departure_time_;
        }

        public static class ByNumberComparator implements Comparator < Train > {
            public int compare(Train left, Train right) {
                return left.number - right.number;
            }
        }

        public static class ByDestinationAndTimeComparator implements Comparator < Train > {
            public int compare(Train left, Train right) {
                if (left.destination == right.destination)
                    return left.departure_time.compareTo(right.departure_time);

                return left.destination.compareTo(right.destination);
            }
        }

        public void print() {
            System.out.println(number + " -> " + destination + " : " + departure_time);
        }
    }

