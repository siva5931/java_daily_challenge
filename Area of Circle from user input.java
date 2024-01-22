import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args){
        int a;
        double pi = 3.142, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius");
        a = sc.nextInt();
        area = pi*a*a;
        System.out.println("Area of the circle:"+area);
        
    }
}
