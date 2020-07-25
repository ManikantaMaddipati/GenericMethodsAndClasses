package shopping;

public class Shop {
    public static void main(String[] args) {
        //glovePair knows about Glove , but not other size of the equals
        Pair<Glove> glovePair = new Pair<>(new Glove(44, "Red") ,new Glove(44, "Red"));
    }
}
