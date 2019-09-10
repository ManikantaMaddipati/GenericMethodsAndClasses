public class OverloadedMethods
{
    public static void main(String[] args)
    {
        Integer integer[] = {1,2,3,4,5,6};
        Character chars[]={'a','b','c'};
        Double dou[] = {1.1,2.2,3.3,4.4};
/**
 * Overloaded methods are user to perform same operation in different types of data. Looking the method method prameters
 * and for-loop. They can be replaced eith Single-generic-type.
 */
        System.out.println("Array of integers");
        printarray(integer);
        System.out.println("Array of chars");
        printarray(chars);
        System.out.println("Array of dou");
        printarray(dou);



    }
    private static void printarray(Integer[] integer) {
        for(Integer i : integer){
            System.out.printf("%s ",i) ;
        }
        System.out.println();
    }
    private static void printarray(Character[] chars) {
        for(Character i : chars){
            System.out.printf("%s ",i) ;
        }
        System.out.println();

    }
    private static void printarray(Double[] dou) {
        for(double i : dou){
            System.out.printf("%s ",i) ;
        }
        System.out.println();

    }
}
