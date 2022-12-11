import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Enter the year : ");
        year = input.nextInt();

        if(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
            System.out.println("Not Leap Year!");
        else
            System.out.println("Leap Year!");
    }
}
