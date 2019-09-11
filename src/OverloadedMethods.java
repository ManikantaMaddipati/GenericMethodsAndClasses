public class OverloadedMethods
{
    public static void main(String[] args)
    {
        Integer integer[] = {1,2,3,4,5,6};
        Character chars[]={'a','b','c'};
        Double dou[] = {1.1,2.2,3.3,4.4};

        System.out.println("Array of integers");
        printarray(integer);
        System.out.println("Array of chars");
        printarray(chars);
        System.out.println("Array of dou");
        printarray(dou);
    }
//    private static void printarray(Integer[] integer) {
//        for(Integer i : integer){
//            System.out.printf("%s ",i) ;
//        }
//        System.out.println();
//    }
//    private static void printarray(Character[] chars) {
//        for(Character i : chars){
//            System.out.printf("%s ",i) ;
//        }
//        System.out.println();
//
//    }
//    private static void printarray(Double[] dou) {
//        for(double i : dou){
//            System.out.printf("%s ",i) ;
//        }
//        System.out.println();
//
//    }

    /**
     * Advantage of generic method is Compilation time Type Safe hence prevents runtime errors.
     *
     *
     * All Generic Methods type parameter section that is precedes return type
     * 1>type parameter section can contain one or more type variables separated by commas
     * 2>type variables can used as return type , parameters and local-variables.
     * 3>type variables can represent only reference types not primitive types.
     * 4>type variable  can appear only once in  type parameter section but can appear more that once in method parameter list.
     *
     *
     * What is happening here?
     * 1.Compiler encounters printarray(integer) then locate printarray(Integer[] integer) it is not there.
     * so next compiler locate for generic method named printarray with single array array parameter and uses typed variable
     * 2.Compilier also determines if the operation in method body can be performed on elements that are being passed as parameter.
     *
     *
     */

    public static <T> void printarray(T[] inputarray){
        for(T element : inputarray){
            System.out.printf("%s",element);
        }

        /**
         * After copilation in byte code above code is represented as
         *  public static void printarray(object [] inputarray){
         *         for(object element : inputarray){
         *             System.out.printf("%s",element);
         *         }
         */
    }

}
