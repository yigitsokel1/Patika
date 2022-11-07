import java.util.Scanner;

public class groceryStore {
    public static void main(String[] args) {
        /*Pear: 2.14 TL
        Apple : 3.67 TL
        Tomatoes: 1.11 TL
        Banana: 0.95 TL
        Aubergine : 5.00 TL
         */
        int pear, apple, tomatoes, banana, aubergine;
        Scanner input = new Scanner(System.in);

        System.out.print("How many kilograms of pear :");
        pear = input.nextInt();
        System.out.print("How many kilograms of apple :");
        apple = input.nextInt();
        System.out.print("How many kilograms of tomatoes :");
        tomatoes = input.nextInt();
        System.out.print("How many kilograms of banana :");
        banana = input.nextInt();
        System.out.print("How many kilograms of aubergine :");
        aubergine = input.nextInt();

        System.out.println("Price = " + ((pear * 2.14)+(apple * 3.67)+(tomatoes * 1.11)+(banana * 0.95)+(aubergine * 5)));
    }
}
