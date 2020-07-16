import org.junit.Test;

import static org.junit.Assert.*;

public class GenericClassesTest {


    @Test
    public void testGenericClasses(){
     Stack<Double> doubleStack = new Stack<Double>();
     doubleStack.push(1.0);
     Double test=1.0;
     assertEquals("Must return Double Value",test,doubleStack.pop());
    }


}