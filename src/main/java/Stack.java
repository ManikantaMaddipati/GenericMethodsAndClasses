import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Stack<E> {
    //Class Stack declares variable elements as an ArrayList<E>
    private final ArrayList<E> elements;

    public Stack(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<E>(initCapacity);
    }

    //The Stack class’s no-argument constructor invokes the one-argument constructor to create a Stack in which the underlying ArrayList has a capacity of 10 elements
    //The one-argument constructor can also be called directly to create a Stack with a specified initial capacity
    public Stack() {
        this(10);
    }

    public void push(E pushValue) {
        elements.add(pushValue);
    }

    public E pop() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("Stack is empty, cannot pop");
        }
        return elements.remove(elements.size() - 1);
    }
}
