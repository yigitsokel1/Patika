import java.util.Scanner;

public class Sum4xNumbers {
    public static void main(String[] args) {
        //With Java loops, we write a program that accepts inputs from the user until a single number is entered and
        // collects even and multiples of 4 from the entered values and prints it on the screen.

        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        do{
            System.out.print("Enter the number : ");
            number = input.nextInt();
            if(number % 4 == 0)
                sum += number;
        }while(number % 2 == 0);

        System.out.println("Sum of Entered Numbers : " + sum);
    }
}
