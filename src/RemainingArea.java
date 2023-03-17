import java.util.Scanner;
import java.text.DecimalFormat;

public class RemainingArea {
    private static final DecimalFormat df = new DecimalFormat("0.0000");
    public static void main(String[] args){

        double pi = 3.141592;

        System.out.println("Find X Area");

        Scanner getRadiant = new Scanner(System.in);
        System.out.println("Enter Radiant : ");
        double radiant = getRadiant.nextDouble();
        double xArea = ((radiant*4)*(radiant*2))-Math.pow(radiant, 2)*pi*2;

        System.out.println("This X Area is equal: " + xArea);
        System.out.println("This X Area is equal: " + df.format(xArea));
    }
}
