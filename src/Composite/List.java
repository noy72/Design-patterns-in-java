package Composite;

import java.util.ArrayList;

public class List implements Entity {
    private ArrayList<Entity> items = new ArrayList<>();
    private int depth = 0;

    @Override
    public void print() {
        for(Entity entity : items){
            entity.print();
        }
    }

    @Override
    public int getSize(){
        int size = 0;
        for(Entity entity : items){
            size += entity.getSize();
        }
        return size;
    }

    @Override
    public void setDepth(int depth) {
        this.depth = depth;
        for(Entity entity : items){
            entity.setDepth(this.depth + 1);
        }
    }


    public void add(Entity entity){
        entity.setDepth(depth + 1);
        items.add(entity);
    }
}
