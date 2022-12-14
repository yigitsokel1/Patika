import java.util.Scanner;

public class AdvancedCalculater {
    /*
        1- Addition
        2- Subtraction
        3- Multiplication
        4- Division
        5- Exponent Calculation
        6- Factorial Calculation
        7- Get Mode
        8- Rectangular Area and Perimeter Calculation
     */



    static double addition(double x ,double y){
        return x+y;
    }

    static double sub(double x, double y){
        return x-y;
    }

    static double multiplication(double x, double y){
        return x*y;
    }

    static double division(double x, double y){
        return x/y;
    }

    static int exp(int x, int y){
        int i;
        int exp = 1;
        for(i=0;i<y;i++){
            exp *= x;
        }
        return exp;
    }

    static int factorial(int x){
        if(x==1)
            return 1;
        else
            return x*factorial(x-1);
    }

    static int mode(int x, int y){
        return x%y;
    }

    static void rectangular(double x, double y){
        double area = x*y;
        double perimeter = 2*x + 2*y;
        System.out.println("Area of Rectangular : "+ area);
        System.out.println("Perimeter of Rectangular : "+ perimeter);
    }

    static void menu(){
        System.out.println("MENU");
        System.out.println("1- Addition");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("5- Exponent Calculation");
        System.out.println("6- Factorial Calculation");
        System.out.println("7- Get Mode");
        System.out.println("8- Rectangular Area and Perimeter Calculation");
        System.out.println("0- Exit");
        System.out.print("Selection : ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection;
        int num1, num2;
        double n1, n2;
        do{
            menu();
            selection = input.nextInt();
            switch (selection){
                case 1:
                    System.out.print("Enter the first number : ");
                    n1 = input.nextDouble();
                    System.out.print("Enter the second number : ");
                    n2 = input.nextDouble();
                    System.out.println(n1 + " + " + n2 + " = " + addition(n1,n2));
                    break;
                case 2:
                    System.out.print("Enter the first number : ");
                    n1 = input.nextDouble();
                    System.out.print("Enter the second number : ");
                    n2 = input.nextDouble();
                    System.out.println(n1 + " - " + n2 + " = " + sub(n1,n2));
                    break;
                case 3:
                    System.out.print("Enter the first number : ");
                    n1 = input.nextDouble();
                    System.out.print("Enter the second number : ");
                    n2 = input.nextDouble();
                    System.out.println(n1 + " * " + n2 + " = " + multiplication(n1,n2));
                    break;
                case 4:
                    System.out.print("Enter the first number : ");
                    n1 = input.nextDouble();
                    System.out.print("Enter the second number : ");
                    n2 = input.nextDouble();
                    System.out.println(n1 + " / " + n2 + " = " + division(n1,n2));
                    break;
                case 5:
                    System.out.print("Enter the first number : ");
                    num1 = input.nextInt();
                    System.out.print("Enter the second number : ");
                    num2 = input.nextInt();
                    System.out.println(num1 + " ^ " + num2 + " = " + exp(num1,num2));
                    break;
                case 6:
                    System.out.print("Enter the number : ");
                    num1 = input.nextInt();
                    System.out.println(num1 + "! = " + factorial(num1));
                    break;
                case 7:
                    System.out.print("Enter the number : ");
                    num1 = input.nextInt();
                    System.out.print("Enter the mod number : ");
                    num2 = input.nextInt();
                    System.out.println(num1 + " % " + num2 + " = " + mode(num1,num2));
                    break;
                case 8:
                    System.out.print("Enter the short edge : ");
                    n1 = input.nextDouble();
                    System.out.print("Enter the long edge : ");
                    n2 = input.nextDouble();
                    rectangular(n1,n2);
                    break;
                case 0:
                    System.out.println("See You!");
                    break;
                default:
                    System.out.println("Wrong Choice! Try Again!");
                    break;
            }
        }while(selection != 0);




    }



}
