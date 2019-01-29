package Prototype;

import Prototype.framework.Manager;

public class Main {
    public static void main(String[] args){
        Manager manager = new Manager();
        manager.register("strong message", new UnderlinePen('-'));
        manager.register("warning box", new MessageBox('*'));
        manager.register("slash box", new MessageBox('/'));

        manager.create("strong message").use("hello world.");
        manager.create("warning box").use("hello world.");
        manager.create("slash box").use("hello world.");
    }
}
