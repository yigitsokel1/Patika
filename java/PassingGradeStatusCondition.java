import java.util.Scanner;

public class PassingGradeStatusCondition {
    public static void main(String[] args) {
        //Program to calculate passing grade
        //Courses: Mathematics, Physics, Turkish, Chemistry, Music
        //Passing Grade: 55
        //If the course grades entered are not between 0 and 100, they should not be included in the average.
        int math, phy, turkish, che, mus;
        double avg, sum=0;
        int countLesson=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your math grade:  ");
        math = input.nextInt();
        if(math>=0 && math <=100) {
            sum += math;
            countLesson++;
        }

        System.out.print("Please enter your physics grade: ");
        phy = input.nextInt();
        if(phy>=0 && phy <=100) {
            sum += phy;
            countLesson++;
        }

        System.out.print("Please enter your chemistry grade: ");
        che = input.nextInt();
        if(che>=0 && che <=100) {
            sum += che;
            countLesson++;
        }

        System.out.print("Please enter your Turkish grade: ");
        turkish = input.nextInt();
        if(turkish>=0 && turkish <=100) {
            sum += turkish;
            countLesson++;
        }

        System.out.print("Please enter your music grade: ");
        mus = input.nextInt();
        if(mus>=0 && mus <=100) {
            sum += mus;
            countLesson++;
        }
        avg = sum/countLesson;
        System.out.println("Your Grade Average : " + avg);
        if(avg>=55)
            System.out.println("You passed the grade!");
        else
            System.out.println("You failed!");

    }
}
