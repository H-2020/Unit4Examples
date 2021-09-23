import java.util.Scanner;

public class AgeCal2 {

    public static void main(String[] args) {

        //PRINT
        System.out.println("Welcome to age calculator program");

        //PRINT
        System.out.println("Write the age");

        //INPUT(AGE)
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        //IF
        if (age>= 18) {
            //PRINT
            System.out.println("You are an adult");
        }

        //ELSE IF
        else if (age >= 10) {
            //PRINT
            System.out.println("You are a teenager");
        }
        //ELSE IF
        else if (age >= 2) {
            //PRINT
            System.out.println("You are a child");
        }
        //ELSE
        else{
            //PRINT
            System.out.println("You are a baby");
        }

        //PRINT
        System.out.println("Thank you for using this program");

    }

}

