import java.util.Scanner;

public class PowerNumbers {
    public static void main(String[] args) {
        //write a program that prints powers of 4 and 5 up to the number entered with Java loops.
        Scanner input = new Scanner(System.in);
        int number;
        int power = 1;

        System.out.print("Enter the number : ");
        number = input.nextInt();

        System.out.println("Powers of 4");
        while(power < number){
            System.out.println(power);
            power *= 4;
        }
        power = 1;
        System.out.println("Powers of 5");
        while(power < number){
            System.out.println(power);
            power *= 5;
        }

    }
}
