import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args){
        double h,b,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height");
        h = sc.nextInt();
        System.out.println("Enter the Base");
        b = sc.nextInt();
        area = (h*b)/2;
        System.out.println("Area of the Triangle:"+area);
        
    }
}
