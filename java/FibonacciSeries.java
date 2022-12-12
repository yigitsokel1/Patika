import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        int limit;
        int step = 2;
        num1 = 0;
        num2 = 1;
        System.out.print("Enter the step of Fibonacci : ");
        limit = input.nextInt();
        System.out.print(num1 + " , " + num2);
        while(step<limit){
            System.out.print(" , " + (num1+num2));
            num1 = num2;
            num2 = num1+num2;
            step++;
        }
    }
}
