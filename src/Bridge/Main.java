package Bridge;

public class Main {
    public static void main(String[] args){
        Display d1 = new Display(new StringDisplayImpl("Hello1"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello2"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello3"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
