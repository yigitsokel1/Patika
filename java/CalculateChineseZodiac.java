import java.util.Scanner;

public class CalculateChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] horoscopes = {"Monkey", "Cock", "Dog", "Pig", "Mouse", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
        int year;

        System.out.print("Enter the your birth year : ");
        year = input.nextInt();

        System.out.print("Your Chinese Zodiac Horoscope : " + horoscopes[year%12]);




    }
}
