import java.util.Scanner;

public class login {

    public static void main(String[] args) {
        String correctUsername = "Swaraj";
        String correctPassword = "Swaraj@123";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Good Morning");
                break;  
            } else {
                System.out.println("Invalid credentials. Please try again.");
            }
        }
        scanner.close();
    }
}