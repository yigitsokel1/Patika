import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, tmp;
        int sum = 0;

        System.out.print("Enter the number : ");
        number = input.nextInt();
        tmp = number;

        while(tmp > 0){
            sum += tmp % 10;
            tmp = tmp / 10;
        }
        System.out.println("Sum of digits of "+ number +" : " + sum);
    }
}
