package firtspackage;
import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
        int side1;
        int side2;
        int side3;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter first side : ");
        side1 = myScanner.nextInt();
        side2 = myScanner.nextInt();
        side3 = myScanner.nextInt();
        System.out.println(side1+side2+side3);
    }
}
