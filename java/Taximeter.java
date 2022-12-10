import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {
        /*
        Taximeter costs 2.20 TL per km.
        The minimum amount to be paid is 20 TL. 20 TL will be charged for the fees below 20 TL.
        Taximeter opening fee is 10 TL.*/
        Scanner input = new Scanner(System.in);
        int km;
        double perKm = 2.20;
        double sumPrice;
        System.out.print("Enter the distance in km : ");
        km = input.nextInt();
        sumPrice = 10 + km * perKm > 20 ?  10 + km * perKm : 20;
        System.out.println("Sum Price : " + sumPrice);



    }
}
