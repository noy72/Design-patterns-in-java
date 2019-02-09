package Flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private String fontdata;

    public BigChar(char charname) {
        try{
            BufferedReader reader = new BufferedReader(
                    new FileReader("t_" + charname + ".txt")
            );
            String line;
            StringBuffer buf = new StringBuffer();
            while((line = reader.readLine()) != null){
                buf.append(line);
                buf.append('\n');
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    public void print(){
        System.out.print(fontdata);
    }
}
