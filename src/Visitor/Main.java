package Visitor;

import Builder.Director;

public class Main {
    public static void main(String[] args){
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");

        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);

        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));

        rootdir.accept(new ListVisitor());


        System.out.println();
        System.out.println("Making user entries...");

        Directory A = new Directory("A");
        Directory B = new Directory("B");
        Directory C = new Directory("C");

        usrdir.add(A);
        usrdir.add(B);
        usrdir.add(C);

        A.add(new File("diary.html", 100));
        A.add(new File("index.html", 100));
        B.add(new File("memo.tex", 100));
        C.add(new File("image.png", 1000));
        rootdir.accept(new ListVisitor());
    }
}
