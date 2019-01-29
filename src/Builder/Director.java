package Builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public void construct(){
        builder.makeTitle("Title");
        builder.makeString("Number");
        builder.makeItems(new String[]{
                "1", "1", "2", "3",
        });
        builder.makeString("E");
        builder.makeItems(new String[]{
                "e", "e", "e",
        });
        builder.close();
    }
}
