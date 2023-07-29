import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a height for tree (bigger than 3): ");
        int ht = input.nextInt();
        printChristmasTree(ht);
    }

    public static void printStars(int number) {
        for(int i = 1; i <= number; ++i) {
            System.out.print("*");
        }

    }

    public static void printSpaces(int number) {
        for(int i = 1; i <= number; ++i) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int number) {
        for(int i = 1; i <= number; ++i) {
            printSpaces(number - i);
            printStars(i);
            System.out.println("");
        }

        System.out.println("");
    }

    public static void printChristmasTree(int number) {
        int cntr = 1;
        --number;

        for(int i = 1; i <= number; ++i) {
            printSpaces(number - i);
            printStars(cntr);
            cntr += 2;
            System.out.println("");
        }

        printSpaces(number - 2);
        printStars(3);

    }
}

