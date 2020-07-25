package shopping;

public class Glove implements Sized ,Colored{
    private int size;
    private String color;

    @Override
    public String toString() {
        return "Glove{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Glove(int size, String color) {
        this.size = size;
        this.color = color;
    }
}
