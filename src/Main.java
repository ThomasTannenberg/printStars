import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] userInput = scan();
        int hight = (userInput[0]);
        int width = (userInput[1]);
        printStars(width);
        System.out.println("---");
        rectancle(hight, width);
    }
    public static void maxHight(int hight) {
        for (int z = 1; z <= hight; z++) {
            System.out.println();

        }
    }
    public static void printStars(int width) {
        for (int j = 0; j < width; j++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void rectancle(int hight, int width) {
        int counter = 0;
        while (counter < hight) {
            printStars(width);
            counter++;
        }
    }
    public static int[] scan() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set hight:");
        int scan1 = Integer.valueOf(scanner.nextLine());

        System.out.println("set width:");
        int scan2 = Integer.valueOf(scanner.nextLine());

        return new int[] {scan1, scan2};
    }
}
