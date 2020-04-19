import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ManagementSystem {

    public HashMap<Integer, User> users = new HashMap<>();

    public void createUser(User test) {
        Scanner scan = new Scanner(System.in);

        test.flyerNumber = (int) ((Math.random()*1000)+1000);
        if(users.containsKey(test.flyerNumber)){
            test.flyerNumber = (int) ((Math.random()*1000)+1000);
        }

        System.out.print("Name: ");
        test.name = scan.nextLine();
        //System.out.println("Name entered = " + test.getName());

        System.out.print("Address: ");
        test.address = scan.nextLine();
        //System.out.println("Address entered = " + test.getAddress());

        System.out.print("Card Type (G/R): ");
        test.cardType = scan.nextLine();
        //System.out.println("Card Type = " + test.getCardType());

        System.out.println("\n*****************");
        System.out.println(test);
        System.out.println("*****************");
        System.out.print("Confirm Correct (y/n): ");
        if(!scan.nextLine().equals("y")){
            System.out.println("sorry");
        }
        System.out.println("");

        //adds new user to map of users
        addUser(test);

    }

    public void addUser(User u) {
        users.put(u.flyerNumber, u);
        //System.out.println(users);
    }


    /*public static void main(String[] args) {
        String decision = "";
        char code;

        System.out.println("**WELCOME TO THE MANAGEMENT SYSTEM**");

        do {
            Scanner scanning = new Scanner(System.in);

            System.out.println("Choose Menu Item: ");
            System.out.println("u = create new user");
            System.out.println("l = view user");
            System.out.println("e = exit");
            System.out.print("Enter Menu Item: ");

            String type = scanning.nextLine();
            code = type.toUpperCase().charAt(0);

            switch (code) {
                case 'U':
                    System.out.println("Your decision is " + decision);
                    System.out.println("Creating new User...");

                    User u = new User("", "", 0, "");

                    createUser(u);

                    System.out.println("\nUser " + u.getFlyerNum() + ": " + u.getName() + " created");
                    break;
            }
        }while(code!='E');

    }*/

}
