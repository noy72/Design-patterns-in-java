package AbstractFactory.factory;

public abstract class Factory {
    public static Factory getFactory(String classname){
        Factory factory = null;
        System.out.println(classname);
        try {
            factory = (Factory)Class.forName(classname).getDeclaredConstructor().newInstance();
        }catch(ClassNotFoundException e){
            System.err.println("Not found class " + classname);
        }catch(Exception e){
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);

}
