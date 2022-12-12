import java.util.Scanner;

public class InvertTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height;
        int i, j;

        System.out.print("Enter the height of triangle : ");
        height = input.nextInt();

        for(i=height-1; i>=0; i--){
            for(j=0; j<(height-i-1);j++)
                System.out.print(" ");
            for(j=0; j<(2*i+1);j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
