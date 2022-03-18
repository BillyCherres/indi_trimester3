import java.util.LinkedList;

public class squirrel {
    public static void main(String args[])
    {
        // creating object of the class linked list
        // setting linked list too ll
        LinkedList<String> ll = new LinkedList<String>();

        //adding elements to the linked list
        ll.add("nut");
        ll.add("tree");
        ll.add("water");
        ll.add("hole");

        System.out.println(ll);

        // removing elements from the linked list
        ll.remove("water");

        System.out.println(ll);

        ll.set(1, "...");

        System.out.println(ll);


        // if i is less than size of the linked list, add 1 i.
        for (int i = 0; i < ll.size(); i++){
            System.out.println(ll.get(i) + "");
        }

        System.out.println();

        for (String str : ll)
            System.out.print(str + " ");


    }
}
