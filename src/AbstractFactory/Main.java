package AbstractFactory;

import AbstractFactory.factory.*;

public class Main {
    public static void main(String[] args){
        assert(args.length != 1);
        Factory factory = Factory.getFactory(args[0]);

        Link google = factory.createLink("Google", "dummy");
        Link yahoo = factory.createLink("Yahoo", "dummy");

        Link twitter = factory.createLink("Twitter", "dummy");
        Link faceBook = factory.createLink("Facebook", "dummy");

        Tray search = factory.createTray("search");
        search.add(google);
        search.add(yahoo);

        Tray sns = factory.createTray("SNS");
        sns.add(twitter);
        sns.add(faceBook);

        Page page = factory.createPage("LinkPage", "author");
        page.add(search);
        page.add(sns);
        page.output();
    }
}
