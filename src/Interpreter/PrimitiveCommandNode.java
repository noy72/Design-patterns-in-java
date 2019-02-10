package Interpreter;

import java.util.Arrays;

public class PrimitiveCommandNode extends Node{
    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if(!Arrays.asList("go", "right", "left").contains(name)){
            throw new ParseException(name + " is undefined");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
