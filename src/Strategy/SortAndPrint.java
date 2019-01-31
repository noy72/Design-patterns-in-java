package Strategy;

public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;
    public SortAndPrint(Comparable[] data, Sorter sorter){
        this.data = data;
        this.sorter = sorter;
    }
    public void execute(){
        print();
        sorter.sort(data);
        print();
    }
    public void print(){
        for(Comparable comparable : data) System.out.print(comparable + " ");
        System.out.println();
    }
}
