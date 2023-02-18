package banque;

public class Evaluation {
    private int noEvaluation;
    private Question q1;
    private Question q2;

    public Evaluation(int noEvaluation, char idQ1, char idQ2){
        this.noEvaluation = noEvaluation;
        q1 = Banque.getInstance().getQuestion(idQ1);
        q2 = Banque.getInstance().getQuestion(idQ2);
    }

    public String toString(){
        return "\nEvaluation #" + noEvaluation + "\n\tq1 " + q1.toString() + "\n\tq2 " + q2.toString();
    }
}
