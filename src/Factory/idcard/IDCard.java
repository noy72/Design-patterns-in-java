package Factory.idcard;

import Factory.framework.*;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner){
        System.out.println("Create a " + owner + "\'s card.");
        this.owner = owner;
    }
    public void use(){
        System.out.println("Use a " + owner + "\'s card");
    }
    public String getOwner(){
        return owner;
    }
}
