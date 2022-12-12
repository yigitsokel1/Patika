import java.util.Scanner;

public class MaxMinInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,number;
        int i, min=1000, max=-1000;
        System.out.print("Enter the number of numbers : ");
        n = input.nextInt();


        System.out.print("1.number : ");
        number = input.nextInt();
        min = number;
        max = number;
        for(i=1; i<n; i++){
            System.out.print((i+1) + ".number : ");
            number = input.nextInt();
            if(number < min)
                min = number;
            if(number > max)
                max = number;
        }

        System.out.println("MIN : "+ min +"\nMAX : "+ max);
    }
}
