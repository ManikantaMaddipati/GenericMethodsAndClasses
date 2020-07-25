package shopping;

public class Pair<E> {
    //
    private E left;
    //
    private E right;

    public Pair(E left, E right) {
        this.left = left;
        this.right = right;
    }

    public E getLeft() {
        return left;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    public Boolean isMatched(){
        //Observation : Why getSize() is compilation error;
        return left.getSize() == right.getSize();
    }

    public void setLeft(E left) {
        this.left = left;
    }

    public E getRight() {
        return right;
    }

    public void setRight(E right) {
        this.right = right;
    }
}
