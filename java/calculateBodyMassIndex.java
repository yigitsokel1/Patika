import java.util.Scanner;

public class calculateBodyMassIndex {
    public static void main(String[] args) {
        //Formula : Weight (kg) / Height(m) * Height(m)
        Scanner input = new Scanner(System.in);
        int weight;
        double height;

        System.out.print("Enter your weight(in kg) : ");
        weight = input.nextInt();
        System.out.print("Enter your height(in meters) : ");
        height = input.nextDouble();

        System.out.println("Your Body Mass Index = " + (weight/(height*height)));


    }
}
