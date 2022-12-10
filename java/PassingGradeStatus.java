import java.util.Scanner;

public class passingGradeStatus {

    //Program to calculate passing grade
    //Courses: Mathematics, Physics, Turkish, Chemistry, Music
    //Passing Grade: 60
    //If the course grades entered are not between 0 and 100, they should not be included in the average.

    public static void main(String[] args) {
        int mat, phy, che, turkish, his, mus;
        double avg;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your math grade:  ");
        mat = input.nextInt();

        System.out.print("Please enter your chemistry grade: ");
        che = input.nextInt();

        System.out.print("Please enter your physics grade: ");
        phy = input.nextInt();

        System.out.print("Please enter your Turkish grade: ");
        turkish = input.nextInt();

        System.out.print("Please enter your history grade: ");
        his = input.nextInt();

        System.out.print("Please enter your music grade: ");
        mus = input.nextInt();

        avg = (mat+phy+che+turkish+his+mus)/6.0;
        System.out.println("Average : " + avg);

        String str = avg > 60 ? "You passed the grade!" :"You failed!";
        System.out.println(str);

    }
}
