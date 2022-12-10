import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        int number1, number2;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        number1 = input.nextInt();
        System.out.print("Enter the Second Number : ");
        number2 = input.nextInt();

        System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nSelection : ");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.println(number1+number2);
                break;
            case 2:
                System.out.println(number1-number2);
                break;
            case 3:
                System.out.println(number1*number2);
                break;
            case 4:
                if(number2 != 0)
                    System.out.println(number1/number2);
                else
                    System.out.println("Divide by 0 Error!!");
                break;
            default:
                System.out.println("Wrong Choice!");
                break;
        }

    }
}
