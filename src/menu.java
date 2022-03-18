import java.util.Dictionary;
import java.util.Scanner;

public class menu {

    //Initialize variables
    private Dictionary<Integer, funcMaster> elements;
    Scanner input = new Scanner(System.in);

    //Constructor
    public menu(Dictionary<Integer, funcMaster> elements) {
        //Takes dictionary as input
        this.elements = elements;
    }

    //Iterate over dictionary and print all values
    // when int is less then the size of the dictionary, i adds 1
    // this prints the parts of the dictionary
    public void print() {
        for(int i = 1; i <= this.elements.size(); i++) {
            System.out.print(i + " ");
            System.out.println(elements.get(i).getSelection());
        }
    }

    public void run(int x) {
        this.elements.get(x).run();
    }
}