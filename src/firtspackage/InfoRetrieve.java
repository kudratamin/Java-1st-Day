package firtspackage;
import java.util.Scanner;
public class InfoRetrieve {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String name;
        name = myScan.nextLine();
        String hairColor;
        hairColor = myScan.nextLine();
        int age;
        age = myScan.nextInt();
        double weight;
        weight = myScan.nextDouble();
        System.out.println("name \t hairColor \t age \t weight");
    }
}


