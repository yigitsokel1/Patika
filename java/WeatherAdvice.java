import java.util.Scanner;

public class WeatherAdvice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tem;
        System.out.print("Enter the temperature in degrees : ");
        tem = input.nextInt();

        if(tem<5)
            System.out.println("You should ski!");
        else if (tem>=5 && tem<15)
            System.out.println("You should go to the movies!");
        else if (tem >=15 && tem<25)
            System.out.println("You should go on picnic!");
        else
            System.out.println("You should swim!");




    }
}
