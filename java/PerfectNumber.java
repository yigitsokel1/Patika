import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //A perfect number is a number whose sum of positive integer factors (divisors without a remainder) is equal to itself,
        // excluding the number itself.
        Scanner input = new Scanner(System.in);
        int number;
        int i;
        int sum=0;

        System.out.print("Enter the number : ");
        number = input.nextInt();

        for(i=1;i<number;i++){
            if(number % i == 0)
                sum += i;
        }

        if(number == sum)
            System.out.println(number + " is Perfect Number!");
        else
            System.out.println(number + " is NOT Perfect Number!");
    }
}
