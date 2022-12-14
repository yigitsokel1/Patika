import java.util.Scanner;

public class PalindromeNumbers {
    
    static boolean isPalindrome(int number){
        int temp = number;
        int invertNumber=0;
        int digit;
        
        while(temp != 0){
              digit = temp % 10;
              invertNumber += digit;
              if(temp / 10 != 0)
                  invertNumber *= 10;
              temp /= 10;
        }
        
        if(number == invertNumber)
            return true;
        else 
            return false;
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isTrue;
        int number;

        System.out.print("Enter the number : ");
        number = input.nextInt();
        isTrue = isPalindrome(number);
        if(isTrue)
            System.out.println(number + " is Palindrome Number!");
        else
            System.out.println(number + " is NOT Palindrome Number!");
        
        
    }
}
