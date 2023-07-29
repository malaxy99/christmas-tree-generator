import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // calling final christmas tree making method
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a height for tree (bigger than 3): ");
        int ht = input.nextInt();
        printChristmasTree(ht);
    }

    public static void printStars(int number) {
        //method for printing n amount of asterisks
        for(int i = 1; i <= number; ++i) {
            System.out.print("*");
        }

    }

    public static void printSpaces(int number) {
        //method for printing n amount of spaces
        for(int i = 1; i <= number; ++i) {
            System.out.print(" ");
        }

    }

    public static void printChristmasTree(int number) {
        // final method that make the body of christmas tree
        int cntr = 1;
        --number;

        for(int i = 1; i <= number; ++i) {
            printSpaces(number - i);
            printStars(cntr);
            cntr += 2;
            System.out.println("");
        }
        //for printing base of tree
        printSpaces(number - 2);
        printStars(3);

    }
}

