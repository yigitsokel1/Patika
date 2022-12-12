import java.util.Scanner;

public class CalculateCombination {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)
        Scanner input= new Scanner(System.in);
        int n, r;
        int i;
        int process1=1, process2=1, process3=1;

        System.out.println("C(n,r) = n! / (r! * (n-r)!)");

        do{
            System.out.print("Enter the n : ");
            n = input.nextInt();
        }while(n<1);

        do{
            System.out.print("Enter the r : ");
            r = input.nextInt();
        }while(r<=0);

        for(i=1; i<=n; i++)
            process1 *= i;

        for(i=1; i<=r; i++)
            process2 *= i;

        for(i=1; i<=(n-r); i++)
            process3 *= i;

        System.out.println("Result : "+ (process1)/(process2*process3));







    }
}
