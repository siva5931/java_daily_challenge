//Input a year and find whether it is a leap year or not.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int year;
        System.out.println("enter the year: ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 ==0))
        System.out.println("this is a leap year");
        else
        System.out.println("it is not a leap year");
    }
}
