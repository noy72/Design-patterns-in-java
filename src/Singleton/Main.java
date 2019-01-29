package Singleton;

public class Main {
    public static void main(String[] args){
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1.equals(obj2));

        Triple tri0 = Triple.getInstance(0);
        Triple tri1 = Triple.getInstance(1);
        Triple tri2 = Triple.getInstance(2);
        System.out.println(tri0.toString() + tri1.toString() + tri2.toString());
    }
}
