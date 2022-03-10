import java.sql.SQLOutput;
import java.util.Dictionary;

public class menu {

    //initializing variables
    private Dictionary elements;

    //constructor
    public menu(Dictionary elements) {
        this.elements = elements;

    }

    // we are iterating through the forloop to print everything in the dictionary
    public void print() {
        //setting the variable i to 1... while i is less then the size of the dictionary, then you add 1 to i
        for (int i = 1; i <= this.elements.size(); i++) {
            System.out.println(elements.get(i));
        }
    }
}
