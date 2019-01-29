package Builder;

public class Main {
    public static void main(String[] args){
        {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            System.out.println(textBuilder.getResult());
        }

        {
            MarkdownBuilder markdownBuilder = new MarkdownBuilder();
            Director director = new Director(markdownBuilder);
            director.construct();
            System.out.println(markdownBuilder.getResult());
        }
    }
}
