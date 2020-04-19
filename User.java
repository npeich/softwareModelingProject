import java.lang.*;

public class User {
    public String name;
    public String address;
    public int flyerNumber;
    public String cardType;


    public User(String nameIn, String addIn, int numIn, String cardIn){
        name = nameIn;
        address = addIn;
        flyerNumber = numIn;
        cardType = cardIn;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String add) {
        address = add;
    }

    public int getFlyerNum() {
        return flyerNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String n) {
        cardType = n;
    }

    public String toString() {
        String output = "";


        output += "User: " + name + "\nFrequent Flyer Number: " + flyerNumber;

        if(cardType.equals("R") || cardType.equals("r")){
            output += "\nRed Card Holder";
        }
        if(cardType.equals("G") || cardType.equals("g")){
            output += "\nGold Card Holder";
        }

        return output;
    }

    /*public static void main (String[] args) {
        User u1 = new User("Natalie Eichorn", "1783 w ave", 123456, 'r');

        System.out.println(u1);

        u1.setCardType('g');

        System.out.println(u1);
    }*/
}
