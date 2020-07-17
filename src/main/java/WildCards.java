import java.util.ArrayList;
import java.util.List;

public class WildCards<T> {
    //Because generic classes can be used only with class or interface types,
    // the numbers would be autoboxed as objects of the type-wrapper classes.
    // For example, any int value would be autoboxed as an Integer object, and any double value would be autoboxed as a Double object.
    // We’d like to be able to total all the numbers in the List regardless of their type. For this reason,
    // we’ll declare the List with the type argument Number, which is the superclass of both Integer and Double.
    // In addition, method sum will receive a parameter of type List<Number> and total its elements.
    Number[] numbers = {1, 2.4, 3, 4.1};
    List<Number> numberList = new ArrayList();

    public Double action(){
        for (Number element : numbers) {
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
