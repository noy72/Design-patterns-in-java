package Composite;

public class Item implements Entity{
    private String string;
    private int depth = 0;

    public Item(String string) {
        this.string = string;
    }

    @Override
    public void print() {
        for(int i = 0; i < depth - 1; i++){
            System.out.print(' ');
        }
        System.out.println("- " + string);
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public void setDepth(int depth) {
        this.depth = depth;
    }
}
