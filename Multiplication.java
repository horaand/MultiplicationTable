package MultiplicationTable;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Data:");

        System.out.println("Input the first number:");
        int x = scanner.nextInt();
        System.out.println("Results: ");

        for(int i = 0; i<= 10; i++){
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }
}
