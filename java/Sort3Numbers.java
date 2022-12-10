import java.util.Scanner;

public class Sort3Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Enter the 1.number : ");
        n1 = input.nextInt();
        System.out.print("Enter the 2.number : ");
        n2 = input.nextInt();
        System.out.print("Enter the 3.number : ");
        n3 = input.nextInt();

        if((n1 >= n2) && (n1>=n3)){
            if(n2 > n3)
                System.out.println(n3 + " < " + n2 + " < " + n1);
            else
                System.out.println(n2 + " < " + n3 + " < " + n1);
        } else if ((n2 >= n1) && (n2>=n3)) {
            if(n1 > n3)
                System.out.println(n3 + " < " + n1 + " < " + n2);
            else
                System.out.println(n1 + " < " + n3 + " < " + n2);
        }else{
            if(n2 > n1)
                System.out.println(n1 + " < " + n2 + " < " + n3);
            else
                System.out.println(n2 + " < " + n1 + " < " + n3);
        }

    }
}
