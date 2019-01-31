package Strategy;

public class Main {
    public static void main(String[] strings){
        {
            String[] data = {
                    "Strategy", "Prototype", "Template", "Iterator",
            };
            SortAndPrint saps = new SortAndPrint(data, new SelectionSoter());
            saps.execute();
        }

        {
            String[] data = {
                    "Strategy", "Prototype", "Template", "Iterator",
            };
            SortAndPrint sapb = new SortAndPrint(data, new BubbleSoter());
            sapb.execute();
        }
    }
}
