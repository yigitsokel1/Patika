import java.util.Scanner;

public class RecursiveFibonacciSeries {

    static int fibonacciSeries(int n){

        if(n == 1 || n==2){
            return 1;
        }else{
            return fibonacciSeries(n-1) + fibonacciSeries(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit;
        int result;

        System.out.print("Enter the step of Fibonacci : ");
        limit = input.nextInt();
        result = fibonacciSeries(limit);
        System.out.println("Result : " + result);

    }
}
