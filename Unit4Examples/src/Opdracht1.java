import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args) {

        //CREATE A SCANNER
        Scanner scanner = new Scanner(System.in);

        //PRINT->Welcome
        System.out.println("Welcome to sum programma");

        //PRINT->Number1
        System.out.println("Enter number1:");

        //INPUT->Number1
        int number1 = scanner.nextInt();

        //PRINT->Number2
        System.out.println("Enter number2");

        //INPUT->Number2
        int number2 = scanner.nextInt();

        //CALCULATE->Opdracht1
        int sum = number1 + number2;

        //PRINT->Opdracht1
        System.out.println("The sum of the numbers is:" + sum);

        //PRINT->Goodbye
        System.out.println("Thank you for using this programma");

        //CLOSE Scanner
        scanner.close();

    }
}
