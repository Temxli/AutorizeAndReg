import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main system = new Main();
        while (true) {
            system.run();
        }
    }
    private UserManager userManager;

    public Main() {
        userManager = new UserManager();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        userManager.manager();

        System.out.println("Welcome to the Confidential Information System");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Quit");
        System.out.print("Enter your choice: ");


        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {

            case 1:
                System.out.print("Enter a username: ");
                String username = scanner.nextLine();
                System.out.print("Enter a password: ");
                String password = scanner.nextLine();
                userManager.registerUser(username, password);
                System.out.println("User registered successfully");
                break;
            case 2:
                System.out.print("Enter your username: ");
                username = scanner.nextLine();
                System.out.print("Enter your password: ");
                password = scanner.nextLine();
                if (userManager.login(username, password)) {
                    System.out.println("Login successful");
                    // Display the confidential information
                    System.out.println("Confidential information: XYZ");
                } else {
                    System.out.println("Invalid username or password");
                }
                break;
            case 3:
                System.out.println("Goodbye");
                System.exit(0);
            default:
                System.out.println("Invalid choice");
                break;
        }


    }
}