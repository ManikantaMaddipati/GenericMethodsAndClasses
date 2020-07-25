package shopping;

public class Shop {
    public static void main(String[] args) {
        //glovePair knows about Glove , but not other size of the equals
        ClothingPair<Glove> glovePair = new ClothingPair<>(new Glove(44, "Red") ,new Glove(44, "Red"));
        System.out.println("Gloves match " + glovePair.isMatched());
    }
}
