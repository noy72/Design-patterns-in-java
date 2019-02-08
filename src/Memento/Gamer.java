package Memento;

import java.util.Random;

public class Gamer {
    private int money;
    private Random random = new Random();

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet(){
        if(money < 100){
            System.out.println("END");
            return;
        }
        final int before = money;
        money -= 100;

        int dice = random.nextInt(6) + 1;
        switch (dice){
            case 1:
                money += 100;
            case 3:
                money += 100;
            case 5:
                money += 100;
                break;
        }
        System.out.println(before + " -> " + money);
    }

    public Memento createMemento(){
        return new Memento(money);
    }

    public void restoreMemento(Memento memento){
        this.money = memento.money;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                '}';
    }
}
