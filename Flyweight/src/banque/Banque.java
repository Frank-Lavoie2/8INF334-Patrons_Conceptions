package banque;

import java.util.HashMap;

public class Banque {
    private HashMap<Character, Question> questions;
    private static Banque banque = new Banque();

    private Banque(){
        questions = new HashMap<Character, Question>();
    }

    public static Banque getInstance(){
        return banque;
    }

    Question getQuestion(char id){
        return chargerQuestion(id);
    }

    private Question chargerQuestion(char id){
        Question question = null;
        try{
            Class<Question> classeQuestion = (Class<Question>) Class.forName("banque.Question" + id);
            question = classeQuestion.getDeclaredConstructor().newInstance();
            questions.put(id, question);
        }catch (Exception e){
            e.printStackTrace();
        }
        return question;
    }
}
