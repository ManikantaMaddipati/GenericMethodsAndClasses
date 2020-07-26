package shopping;

//Constraint on E not statment about E
//Do so we can satisfy both string and Glove.
public class ClothingPair<E extends Sized & Colored> extends Pair<E> {
    //Ignore constructor when reviewing
    public ClothingPair(E left, E right) {
        super(left, right);
    }

    public Boolean isMatched(){
        //Observation : Why getSize() is compilation error;
        return left.getSize() == right.getSize()
        && left.getColor().equals(left.getColor());
    }

    //Observation 9: method parameters throws exception ON E..Why?
    //1. Static generic types in class cannot be used in static methods.
    //2. We can have other generic types in parameter section.
    public static <E extends Sized & Colored>boolean matches(E left, E right){
        return left.getSize() == right.getSize()
                && left.getColor().equals(left.getColor());
    }



}
