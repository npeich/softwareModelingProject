import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ManagementSystem {

    public HashMap<User, String> usersText = new HashMap<>();
    public HashMap<String, User> users = new HashMap<>();

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

        //create text file
        String fileName = "/Users/natalieeichorn/Desktop/";
        fileName += test.name + ".txt";
        try {
            PrintWriter outputStream = new PrintWriter(fileName);
            outputStream.println(test);
            outputStream.close();
            System.out.println("***User added!***");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void addUser(User u) {
        String f = u.name + ".txt";

        usersText.put(u, f);
        //System.out.println(users);
        users.put(u.name, u);
    }

    //check to see if it exists
    //return that it mactches username and password being passed to Mgmt Sys
    //returns true if user exists
    //returns false if user does not exist
    public boolean checkUser(User u) {
        if (usersText.containsKey(u)) {
            return true;
        }
        return false;
    }

    public User returnUser(String u) {

        User returner = users.get(u);
        return returner;
    }
}