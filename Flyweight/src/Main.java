import banque.Evaluation;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        final int NB_ETUDIANTS = 149;
        ArrayList<Evaluation> mesEvaluationsAndroid = new ArrayList<Evaluation>();

        for(int i = 1; i <= NB_ETUDIANTS; i++)
            mesEvaluationsAndroid.add(new Evaluation(i, genererIdQuestion(), genererIdQuestion()));

        for(Evaluation evaluation: mesEvaluationsAndroid)
            System.out.print(evaluation);
    }

    private static char genererIdQuestion(){
        return (char)(ThreadLocalRandom.current().nextInt(65, 68));
    }
}