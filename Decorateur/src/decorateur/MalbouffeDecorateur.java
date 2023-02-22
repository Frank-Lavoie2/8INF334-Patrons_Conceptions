package decorateur;

public abstract class MalbouffeDecorateur implements Malbouffe{
    private Malbouffe malbouffe;

    public MalbouffeDecorateur(Malbouffe malbouffe){
        this.malbouffe = malbouffe;
    }

    public String getDescription(){
        return malbouffe.getDescription();
    }
}
