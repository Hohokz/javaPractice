import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        {

            String trueUsername = "admin";
            String trueEmail = "admin@email.com";
            String truePassword = "1q2w3e4r5t";

            Scanner getInput = new Scanner(System.in);

            System.out.println("Enter Your Username : ");
            String inputUserName = getInput.nextLine();
            System.out.println("Enter Your Password : ");
            String inputPassword = getInput.nextLine();

            if ((inputUserName.equals(trueUsername) || inputUserName.equals(trueEmail)) && inputPassword.equals(truePassword)) {
                System.out.println("Login Success");
            } else {
                System.out.println("Login Fail");
            }
        }
    }

}