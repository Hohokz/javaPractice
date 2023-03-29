import java.util.Scanner;

public class switchCase {
    public static void main (String [] args){
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        int firstNumber = getInput.nextInt();

        System.out.println("Enter Operator : ");
        String theOperator = getInput.next();

        System.out.println("Enter Number 1 : ");
        int secondNumber = getInput.nextInt();

        String text;
        String inputConcat;

        switch (theOperator){
            default:
                text = "Invalid Operator !";
                System.out.println(text);
                break;
            case "+" :
                System.out.println(firstNumber+secondNumber);
                break;
            case "-" :
                System.out.println(firstNumber-secondNumber);
                break;
            case "*" :
                System.out.println(firstNumber*secondNumber);
                break;
            case "/" :
                System.out.println(firstNumber/secondNumber);
                break;
            case "%" :
                System.out.println(firstNumber%secondNumber);
                break;
        }
    }
}
