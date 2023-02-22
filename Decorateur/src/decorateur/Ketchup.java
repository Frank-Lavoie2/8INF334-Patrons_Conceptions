package decorateur;

public class Ketchup extends MalbouffeDecorateur{
    public Ketchup(Malbouffe malbouffe){
        super(malbouffe);
    }

    public String getDescription(){
        return super.getDescription() + " avec ketchup";
    }
}
