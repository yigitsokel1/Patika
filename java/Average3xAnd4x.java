import java.util.Scanner;

public class Average3xAnd4x {
    public static void main(String[] args) {
        //Program that calculates the average of numbers divisible by 3 and 4 from numbers from 0 to the number entered.
        int n;
        int i;
        int sum = 0, count=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        n = input.nextInt();

        for(i=0; i<=n; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sum += i;
                count++;
            }
        }
        System.out.println("Average of numbers divisible by 3 and 4 : "+ (double)(sum/count));

    }
}
