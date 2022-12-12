import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, power, tmp = 1;
        int i;

        System.out.print("Enter the number : ");
        number = input.nextInt();

        do{
            System.out.print("Enter the power(positive) : ");
            power = input.nextInt();
        }while(power < 0);

        for(i=0;i<power;i++)
             tmp *= number;

        System.out.println(number + "^" + power + " = "+ tmp);
    }
}
