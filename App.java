package sg.edu.nus.iss;

import java.io.Console;
import java.io.File;
import java.util.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */

    public static void main(String[] args) {
        String dirPath = "\\data2";
        String fileName = "";

        File newDirectory = new File(dirPath);
        if (newDirectory.exists()) {
            System.out.println("Directory already exists");
        } else {
            newDirectory.mkdir();
        }

        System.out.println("Welcome to my shopping cart");

        List<String> cartItems = new ArrayList<String>();

        Console con = System.console();
        String input = "";

        while(!input.equals("quit")) {
            input = con.readLine("What do you want to perform? (Type 'quit' to exist program)");

            switch(input) {
                case "help":
                    displayString("'List' to show a list of items in shopping cart");
                    displayString("'Login <name> to access your shopping cart");
                    displayString("'add' <Item> to add a new item into your shopping cart");
                    displayString("Delete <item #>");
                    displayString("'quit' to exit this program");
                    break;
                case "list":
                    if (cartItems.size() >0) {
                        for (String item: cartItems) {
                            System.out.println(item);
                        }
                    } else {
                        displayString("Your cart is empty");
                    }
                    break;
                case "users":
                    break;
                default:
            }

            if (input.startsWith("add")) {
                input = input.replace(',',' ');

                String strValue = "";
                Scanner scanner = new Scanner(input.substring(4));

                while(scanner.hasNext()) {
                    strValue = scanner.next();
                    cartItems.add(strValue);

                }
            }

           // if (input)
        }
    }

    public static void displayString(String message) {
        System.out.println(message);
    }
}
