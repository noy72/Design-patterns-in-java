package Builder;

public class MarkdownBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();

    public void makeTitle(String title) {
        buffer.append("---------------------------\n");
        buffer.append("# " + title + "\n\n");
    }

    public void makeString(String str) {
        buffer.append(str + "\n\n");
    }

    public void makeItems(String[] items) {
        for(String item : items){
            buffer.append("- " + item + "\n");
        }
        buffer.append("\n");
    }

    public void close() {
        buffer.append("---------------------------\n");
    }

    public String getResult(){
        return buffer.toString();
    }
}
