import java.util.Scanner;

public class MakePattern {

    static void pattern(int number, int temp, int status){

        if(status == 0 && temp == number){
            System.out.print(temp + "  ");
            return;
        }
        else if(status == 1){
            System.out.print(temp + "  ");
            if(temp - 5 <= 0 )
                pattern(number,temp-5,0);
            else
                pattern(number,temp-5,1);

        }
        else if(status == 0){
            System.out.print(temp + "  ");
            pattern(number,temp+5,0);
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter the number : ");
        number = input.nextInt();
        pattern(number,number,1);

    }
}
