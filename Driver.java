import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        String decision = "";
        char code;

        System.out.println("**WELCOME TO THE MANAGEMENT SYSTEM**");
        ManagementSystem manager = new ManagementSystem();

        do {
            Scanner scanning = new Scanner(System.in);

            System.out.println("\n*****************");
            System.out.println("Choose Menu Item: ");
            System.out.println("u = create new user");
            System.out.println("l = view user");
            System.out.println("e = exit");
            System.out.println("*****************");
            System.out.print("Enter Menu Item: ");

            String type = scanning.nextLine();
            code = type.toUpperCase().charAt(0);

            switch (code) {
                case 'U':
                    System.out.println("Your decision is " + code);
                    System.out.println("\nCreating new User...");

                    User u = new User("", "", 0, "");

                    manager.createUser(u);

                    System.out.println("\nUser " + u.getFlyerNum() + ": " + u.getName() + " created");
                    break;
            }
        }while(code!='E');

    }
}
