import java.util.Scanner;

public class LogicKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers, please hit enter after you are done writing each number:");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int result = greenTicket(n1, n2, n3);
        System.out.println(result);
    }

    public static int greenTicket(int n1, int n2, int n3) {
        int result = 0;
        if (n1 == n2) {
            result = result + 10;
            if (n2 == n3) {
                result = result + 10;
                return result;
            }

        }
        if (n2 == n3) {
            result = result + 10;

        }
        if (n1 == n3) {
            result = result + 10;
        }
        return result;
    }

}
