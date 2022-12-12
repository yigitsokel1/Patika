import java.util.Scanner;

public class CalculateHarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double sum=0;
        double i;

        do{
            System.out.print("Enter the number(positive) : ");
            number = input.nextInt();
        }while(number<1);


        for(i=1; i<=number; i++)
            sum += (1.0/i);

        System.out.println("Result : " + sum);


    }
}
