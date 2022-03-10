import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       //initialize scanner (enabling user input)

        Scanner input = new Scanner(System.in);

        // create menu options dictionary
            Dictionary<Integer, String> MyElements = new Hashtable<Integer, String>();
            {
                MyElements.put(1, "test1");
                MyElements.put(2, "test2");

                //Creating menu class object
                menu myMenu = new menu(MyElements);

                System.out.println("Enter item number from the following list: ");
                myMenu.print();
            }

            // read user input
            Integer choice = input.nextInt();
            System.out.println(choice);
        }
    }



// https://www.tutorialcup.com/java/dictionary-in-java.htm

