import java.util.Scanner;

public class calculateKDV {
    public static void main(String[] args) {
        // 0<price<1000 KDV = %18
        // price<1000 KDV = %8

        int price;
        float kdv;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price: ");
        price = input.nextInt();

        kdv = (float) (price >= 1000 ? price * 0.08 :  price * 0.18);
        System.out.println("Without Tax : " + price);
        System.out.println("Tax Price : " + kdv);
        System.out.println("With Tax : " + (float)(kdv+price));
    }
}
