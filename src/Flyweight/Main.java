package Flyweight;

public class Main {
    public static void main(String[] args){
        assert args.length != 0;
        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
