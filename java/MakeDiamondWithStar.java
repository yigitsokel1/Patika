import java.util.Scanner;

public class MakeDiamondWithStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int i, j;

        do{
            System.out.print("Enter the height of middle : ");
            number = input.nextInt();
        }while(number<2);

        for(i=0;i<number;i++){
            for(j=0;j<(number-i);j++)
                System.out.print(" ");
            for(j=0;j<2*i+1;j++)
                System.out.print("*");
            System.out.println();
        }
        for(i=number-1;i>=0;i--){
            for(j=0;j<(number-i);j++)
                System.out.print(" ");
            for(j=0;j<2*i+1;j++)
                System.out.print("*");
            System.out.println();
        }


    }
}
