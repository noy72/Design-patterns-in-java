package Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("Create instance");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
