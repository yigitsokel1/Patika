import java.util.Scanner;

public class CalculateFlightTicketCost {
    public static void main(String[] args) {
        /*
        -Values ​​received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2).
         Otherwise, "You Have Entered Wrong Data!" A warning should be given.
         -If the person is younger than 12 years old, 50% discount is applied on the ticket price.
         -If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
         -If the person is over 65 years old, a 30% discount is applied on the ticket price.
         -If the person has chosen the "Journey Type" round trip, 20% discount is applied on the ticket price.
         */
        Scanner input = new Scanner(System.in);
        int km, age, journeyType;
        double ticketCost;
        double total;

        System.out.print("Enter the distance(in kilometers) : ");
        km = input.nextInt();
        System.out.print("Enter the your age : ");
        age = input.nextInt();
        System.out.print("Select the enter journey type(1 -> One Direction\t2 -> Round Trip) : ");
        journeyType = input.nextInt();
        ticketCost = km * 0.1;
        total = ticketCost;

        if(km>0 && age>0 && (journeyType == 1 || journeyType == 2) ){
            if(age<12)
                total -= total * 0.5;
            else if(age>=12 && age<=24)
                total -= total * 0.1;
            else if(age>=65)
                total -= total * 0.3;
            if(journeyType == 2){
                total -= total * 0.2;
                total *= 2;
            }
            System.out.println("Total Cost : " + total);
        }else
            System.out.println("Hatalı Veri Girdiniz!");
    }
}
