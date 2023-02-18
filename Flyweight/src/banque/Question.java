package banque;

public abstract class Question {
    private String description;

    public Question(String description){
        this.description = description;
    }

    protected String getDescription(){
        return description;
    }

    public String toString(){
        return "Question{" + getClass().getName().toUpperCase().replace("BANQUE.", "").replace("QUESTION", "QUESTION ") + "}";
    }
}
