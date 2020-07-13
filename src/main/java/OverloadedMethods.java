public class OverloadedMethods
{
    public static void main(String[] args)
    {
        System.out.printf("%d %n",
        max(1,2,3));
        System.out.printf("%f %n",
        max(1.1,2.2,3.3));
        System.out.printf("%s",
        max("mani","nani","pani"));

    }

    /***
     * Specifying a type parameters upper-bound:
     * Only objects of the class that implements the interface Comparable<T> can be used in this Method
     *
     * When the code is translated into byte code:
     * private static  Comparable  max( Comparable x,  Comparable y,  Comparable z) {
     *         Comparable maximum = x;
     *         if(y.compareTo(maximum) > 0)
     *         {
     *             maximum = y ;
     *         }
     *         if(z.compareTo(maximum) > 0)
     *         {
     *             maximum = z;
     *         }
     *          return maximum;
     *     }
     *
     * Actually all the typed parameters are replaced with UPPER-BOUND.
     *
     *
     */

    private static <T extends Comparable<T>> T max( T x,  T y,  T z) {
        T maximum = x;
        if(y.compareTo(maximum) > 0)
        {
            maximum = y ;
        }
        if(z.compareTo(maximum) > 0)
        {
            maximum = z;
        }
         return maximum;
    }

    /**
     * Whats happening?
     *
     * when compilier encounters the method call max it looks max() with 3 arguments of type int, but no such method
     * next, compiler looks for generic method. as generic method arguments must be of REFERENCE TYPE so compiler
     * autoboxes as Integer Type and passes to max() and also Class Integer implements Comparable<Integer> so the
     * compareTo(maximum) can be performed {{compiler checks all the operation performed inside the method}}.
     *
     * Here return type is of Comparable but method call is expecting back the type Integer. So during byte code
     * translation explicit cast operation is placed infrount of the method call:
     *
     * (Integer) max(1,2,3)).
     */


}
