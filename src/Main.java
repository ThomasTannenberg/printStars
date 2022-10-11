import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] userInput = scan();
        print(userInput[0],userInput[1]);




    }

    public static int print(int printStart, int printEnd) {
        System.out.println(printStart + printEnd);
        return printStart;
    }
    public static int[] scan() {
        System.out.println("Give a number:");
        Scanner scanner = new Scanner(System.in);
        int scan1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a second number:");
        int scan2 = Integer.valueOf(scanner.nextLine());
        return new int[] {scan1, scan2};

    }
}
