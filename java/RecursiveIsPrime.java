import java.util.Scanner;

public class RecursiveIsPrime {

    static boolean isPrime(int x, int y){

        if(x == y)
            return true;
        else if (x % y == 0)
            return false;
        else
            return isPrime(x,y+1);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        boolean flag;
        System.out.print("Enter the number : ");
        number = input.nextInt();
        if(isPrime(number, 2))
            System.out.println(number + " is Prime Number!");
        else
            System.out.println(number + " is NOT Prime Number!");
        
    }
}
