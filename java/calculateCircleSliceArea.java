import java.util.Scanner;

public class calculateCircleSliceArea {
    public static void main(String[] args) {
        //Formula : (𝜋 * (r*r) * 𝛼) / 360
        Scanner input = new Scanner(System.in);
        double area, pi = 3.14;
        int r, slice;
        System.out.print("Enter the radius : ");
        r = input.nextInt();
        System.out.print("Enter the measure of the center angle : ");
        slice = input.nextInt();
        area = (pi * (r*r) * slice) / 360;
        System.out.println("Area of circle slice = " + area);
    }
}
