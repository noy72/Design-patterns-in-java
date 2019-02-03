package Visitor;

import Iterator.Iterator;

public class ListVisitor extends Visitor{
    private String currentdir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        for (java.util.Iterator it = directory.iterator(); it.hasNext(); ) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
