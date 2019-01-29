package Singleton;

public class Triple {
    private static Triple[] triple = new Triple[] {
            new Triple(0),
            new Triple(1),
            new Triple(2),
    };
    private int id;
    private Triple(int id){
        this.id = id;
    }
    public static Triple getInstance(int id){
        assert(id >= 0 && id <= 2);
        return triple[id];
    }
    public String toString(){
        return "id=" + id;
    }
}
