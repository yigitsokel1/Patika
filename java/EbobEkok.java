import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1,number2;
        int ebob, ekok;
        int tmp, tmp1, tmp2;

        System.out.print("Enter the first number : ");
        number1 = input.nextInt();
        System.out.print("Enter the second number : ");
        number2 = input.nextInt();
        tmp1 = number1;
        tmp2 = number2;


        while(tmp2 != 0){
            tmp = tmp2;
            tmp2 = tmp1 % tmp2;
            tmp1 = tmp;
        }

        System.out.println("EBOB : "+tmp1+"\nEKOK : "+ (number1*number2)/tmp1);

    }
}
