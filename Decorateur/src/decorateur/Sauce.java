package decorateur;

public class Sauce extends MalbouffeDecorateur{
    public Sauce(Malbouffe malbouffe){
        super(malbouffe);
    }

    public String getDescription(){
        return super.getDescription() + " avec de la sauce";
    }
}
