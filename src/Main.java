import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] userInput = scan();
        int hight = (userInput[0]);
        int width = (userInput[1]);
        printStars(width);
        System.out.println("-------");
        rectancle(hight, width);
        System.out.println("-------");
        triangle(hight);
        System.out.println("-------");
        rightTriangle(hight);
        System.out.println("-------");

    }
    public static void maxHight(int hight) {
        for (int z = 1; z <= hight; z++) {
            System.out.println();

        }
    }
    public static void printSpace(int hight) {
        for (int i = hight; i > 0 ; i--) {
            System.out.print(" ");
        }


    }
    public static void printStars(int width) {
        for (int j = 0; j < width; j++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
    public static void rectancle(int hight, int width) {
        int counter = 0;
        while (counter < hight) {
            printStars(width);
            counter++;
        }
    }
    public static void triangle(int hight) {
        int counter = 0;
        while (counter < hight) {
            printStars(counter);
            counter++;
        }
    }
    public static void rightTriangle(int hight) {
        int counter = 0;
        int counter2 = hight - 1;

        while (counter <= hight) {
            printSpace(counter2);
            printStars(counter);
            counter++;
            counter2--;

        }
    }
    public static void christmasTree(int hight) {
        int counter = hight;
        int counter2 = 1;

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
