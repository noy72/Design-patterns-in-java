package Memento;

public class Main {
    public static void main(String[] args){
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for(int i = 0; i < 100; i++){
            System.out.println("==== " + i);
            System.out.println("now " + gamer);

            gamer.bet();

            if(gamer.getMoney() > memento.getMoney()){
                System.out.println("<Save>");
                memento = gamer.createMemento();
            }else if(gamer.getMoney() < memento.getMoney() / 2){
                System.out.println("<Load>");
                gamer.restoreMemento(memento);
            }

            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
            System.out.println();
        }
    }
}
