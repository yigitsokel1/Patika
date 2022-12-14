import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class RecursiveExponent {

    static int exponent(int base, int expNumber){

        if(expNumber == 0){
            return 1;
        }else
            return base * exponent(base,expNumber-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base,ex,result;
        System.out.print("Enter the base number : ");
        base = input.nextInt();
        System.out.print("Enter the exponential number : ");
        ex = input.nextInt();
        result = exponent(base,ex);
        System.out.println(base+ " ^ " + ex + " = " + result);

    }
}
