import java.util.Scanner;

public class calculateAreaTriangle {
    public static void main(String[] args) {
        /*Perimeter of triangle = 2𝑢
          𝑢 = (a+b+c) / 2
          Area * Area = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
        Scanner input = new Scanner(System.in);
        int firstEdge, secondEdge, thirdEdge;
        float u, area;

        System.out.print("Enter the first edge : ");
        firstEdge = input.nextInt();
        System.out.print("Enter the second edge : ");
        secondEdge = input.nextInt();
        System.out.print("Enter the third edge : ");
        thirdEdge = input.nextInt();

        u = (float)(firstEdge+secondEdge+thirdEdge)/2;
        area = (float) Math.sqrt(u * (u - firstEdge) * (u - secondEdge) * (u - thirdEdge));
        System.out.println("Area = " + area);
    }
}
