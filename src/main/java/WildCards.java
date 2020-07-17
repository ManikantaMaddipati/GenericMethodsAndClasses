import java.util.ArrayList;
import java.util.List;

public class WildCards<T> {
    //Because generic classes can be used only with class or interface types,
    // the numbers would be autoboxed as objects of the type-wrapper classes.
    // For example, any int value would be autoboxed as an Integer object, and any double value would be autoboxed as a Double object.
    // We’d like to be able to total all the numbers in the List regardless of their type. For this reason,
    // we’ll declare the List with the type argument Number, which is the superclass of both Integer and Double.
    // In addition, method sum will receive a parameter of type List<Number> and total its elements.


    //Given that method sum can total the elements of a List of Numbers, you might expect that the method would also work for
    // Lists that contain elements of only one numeric type, such as List<Integer>. So we modified class TotalNumbers to create a List of
    // Integers and pass it to method sum. When we compile the program, the compiler issues the following error message:
    // TotalNumbers to create a List of Integers and pass it to method sum. When we compile the program, the compiler issues the following error message:
    //error: incompatible types:
    //List<Integer> cannot be converted to List<Number>
    //Although Number is the superclass of Integer,
    // the compiler doesn’t consider the type List<Number> to be a supertype of List<Integer>
    Integer[] numbers = {1, 2, 3, 4};
    List<Integer> numberList = new ArrayList();

   //How do we create a more flexible version of method sum that can total the elements of any List containing elements of any subclass of Number?
    // This is where wildcard type arguments are important

    public Double action(){
        for (Integer element : numbers) {
            numberList.add(element);
        }
       return sum(numberList);
    }

    public static double sum(List<Number> list) {
        double total = 0;
        for (Number element : list) {
            total += element.doubleValue();
        }
        return total;
    }

}
