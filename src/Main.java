import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] userInput = scan();
        print(userInput[0],userInput[1]);

    }
    public static void print(int printStart, int printEnd) {
        int start = printStart;
        int end = printEnd;

        while (start <= end) {
            System.out.println(" ");
            for (int i = printStart; i <= printEnd; i++) {
                System.out.print("*");
            }
            start++;
        }

    }
    public static int[] scan() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int scan1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a second number:");
        int scan2 = Integer.valueOf(scanner.nextLine());

        return new int[] {scan1, scan2};
    }
}
