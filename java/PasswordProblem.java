import java.util.Scanner;

public class PasswordProblem {
    public static void main(String[] args) {

        String realUsername = "patika";
        String realPassword = "patika123";
        String username, password;
        String selection;
        Scanner input = new Scanner(System.in);

        System.out.print("Username : ");
        username = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();

        if(username.equals(realUsername) && password.equals(realPassword))
            System.out.println("Logged In!");
        else if (username.equals(realUsername)) {
            System.out.print("Do you want to change your password(Yes/No)\nYour Select : ");
            selection = input.nextLine();
            if(selection.equals("yes") || selection.equals("Yes") || selection.equals("YES")){
                System.out.print("New password : ");
                password = input.nextLine();
                if(password.equals(realPassword))
                    System.out.println("Could not create password, please enter another password!");
                else {
                    System.out.println("Password created!");
                    realPassword = password;
                }
            }else if(selection.equals("no") || selection.equals("No") || selection.equals("NO")){
                System.out.println("Have a good days!");
            }else
                System.out.println("Wrong Select!");
        }else
            System.out.println("Invalid Username!");
    }
}
