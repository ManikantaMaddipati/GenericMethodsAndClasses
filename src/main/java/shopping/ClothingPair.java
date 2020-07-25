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

}
