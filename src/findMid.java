import java.util.Scanner;

public class findMid {
    public static void main (String[] args){
        Scanner getInt = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = getInt.nextInt();
        System.out.println("Enter b : ");
        int b = getInt.nextInt();
        System.out.println("Enter c : ");
        int c = getInt.nextInt();

        if(a > b && b > c){
            System.out.println("Mid value is b equal : " + b);
        } else if (b > a && c > b) {
            System.out.println("Mid value is b equal : " + b);
        } else if (b > a && c < a) {
            System.out.println("Mid value is a equal : " + a);
        } else if (b < a && c > a) {
            System.out.println("Mid value is a equal : " + a);
        } else if (c < a && c > b) {
            System.out.println("Mid value is c equal : " + c);
        } else if (c > a && c < b) {
            System.out.println("Mid value is c equal : " + c);
        }

    }
}
