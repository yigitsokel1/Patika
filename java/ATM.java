import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int right = 3;
        boolean flag = false;
        int balance = 1500;
        int money;
        int selection=0;

        while(right>0 && !flag){
            System.out.print("Enter the username : ");
            username = input.nextLine();
            System.out.print("Enter the password : ");
            password = input.nextLine();

            if(username.equals("yigit") && password.equals("1234"))
                flag=true;
            else {
                right--;
                if(right>0)
                    System.out.println("Wrong username or password. Try Again! Your remaining right : "+ right);
                else
                    System.out.println("Your account is blocked!");
            }
        }

        if(flag){
            while(selection != 4){
                System.out.print("1.Deposit Money\n2.Withdraw Money\n3.Query Balance\n" +
                        "4.Exit\nSelection : ");
                selection = input.nextInt();
                if(selection<1 || selection>4)
                    System.out.println("Wrong Choice!");
                else if (selection == 4){
                    flag = false;
                    System.out.println("See You!");
                    break;
                }
                switch (selection){
                    case 1:
                        System.out.println("Your balance : "+ balance);
                        System.out.print("Enter the amount you want to deposit : ");
                        money = input.nextInt();
                        balance += money;
                        System.out.println("Your balance : "+ balance);
                        break;
                    case 2:
                        System.out.println("Your balance : "+ balance);
                        System.out.print("Enter the amount you want to withdraw : ");
                        money = input.nextInt();
                        if(money<balance)
                            balance -=money;
                        else
                            System.out.println("Insufficient Balance!");
                        System.out.println("Your balance : "+ balance);
                        break;
                    case 3:
                        System.out.println("Your balance : "+ balance);
                        break;
                    case 4:
                        System.out.println("See You!");
                        flag = false;
                        break;
                }
            }
        }

    }
}
