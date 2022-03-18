import java.util.ArrayList;
import java.util.EmptyStackException;

public class queue<T> {

    private ArrayList<T> list = new ArrayList<T>();

    public queue() {}

    public void push(T data){
        list.add(data);
    }

    //remove from stack (pop)
    public void pop(){
        //if list is not empty
        if(!list.isEmpty()){
            //remove item from list
            list.remove(0);
        }
        else{
            System.out.println("Stack is empty");
        }
    }

    //view top of stack (peek)
    public T peek(){
        if(!list.isEmpty()){
            return list.get(0);
        }
        else{
            System.out.println("Stack Empty");
            throw new EmptyStackException();
        }
    }

    //view length of stack
    public int length(){
        return list.size();
    }

    //clear stack
    public void clear(){
        list.clear();
    }

    public void display(){
        System.out.println(list);
    }
}
