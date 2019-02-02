package Composite;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        List root = new List();
        root.add(new Item("First item"));
        System.out.println();
        root.print();

        List color = new List();
        color.add(new Item("Red"));
        color.add(new Item("Blue"));
        System.out.println();
        color.print();

        root.add(color);
        System.out.println();
        root.print();
    }

}
