package shopping;

//We need to tell compiler "not anything" it is the one with getSize() method,
//In Inheritance: We have "implements"  - Interface  Note : Interface extents Interface
//                           "extends"  Class
// -------------------------------------------------------------------------------------
//In Generics : "extends" means is assignment compatible with. (In generics world no implements)

public class Pair<E> {
    //
    public E left;
    //
    public E right;

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
