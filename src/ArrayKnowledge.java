import java.util.Scanner;

public class ArrayKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if (choice == 0) {
            System.out.println("input a string up to 100 characters including spaces");
            String input = in.nextLine();
            // method is functional won't go in to method stops at nextLine
            char[] array = stringToArray(input);
        } else if (choice == 2) {
            int start = in.nextInt();
            int end = in.nextInt();
            int step = in.nextInt();
            int[] array = generateArrayWithBounds(start, end, step);
            //ran out of time
        }
    }

    public static char[] stringToArray(String input) {
        char[] array = new char[100];
        int size = 0;
        int length = input.length();
        for (int i = 0; i <= (length - 1); i++) {
            array[i] = input.charAt(i);
            System.out.print(array[i] + ", ");
            size += 1;
        }
        return array;
    }

    public static int[] generateArrayWithBounds(int start, int end, int step) {
        int size = 0;
        int inc = 1;
        int[] array = new int[100];
        for (int i = start; i <= end; i = i + step) {
            array[size] = start + inc;
            size += 1;
            System.out.print(array[size]);
            inc += 1;
        }
        return array;
    }
}
