import java.util.Scanner;

public class StringKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings please hit enter after you are done writing each string:");
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        boolean contains = endOther(str1, str2);
        if (contains) {
            System.out.println("one of these strings is at the end of the other!");
        } else {
            System.out.println("none of these strings are at the end of the other.");
        }
    }

    public static boolean endOther(String str1, String str2) {
        int str1len = str1.length();
        int str2len = str2.length();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1len > str2len) {
            String temp = str1.substring(((str1len + 1) - str2len) - 1);
            System.out.println(temp);
            boolean contains = temp.contains(str2);
            if (contains) {
                return true;
            } else {
                return false;
            }
        } else {
            String temp = str2.substring(((str2len + 1) - str1len) - 1);
            System.out.println(temp);
            boolean contains = temp.contains(str1);
            if (contains) {
                return true;
            } else {
                return false;
            }
        }
    }
}
