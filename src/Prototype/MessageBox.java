package Prototype;

import Prototype.framework.*;

public class MessageBox extends Product {
    private char decochar;
    public MessageBox(char decochar){
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for(int i = 0; i < length + 4; i++) System.out.print(decochar);
        System.out.println();
        System.out.println(decochar + " " + s + " " + decochar);
        for(int i = 0; i < length + 4; i++) System.out.print(decochar);
        System.out.println();
    }
}
