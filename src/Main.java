import java.util.Random;

public class Main {

    public static void main(String[] args) {
       askGeneralJavaQuestions();
    }

   static void askGeneralJavaQuestions() {
        Questions questions = new Questions();
        Random random =new Random();
        int randomQuestionIndex = random.nextInt(questions.questions.length-1);
        System.out.println(questions.questions[randomQuestionIndex]);
    }

    void askIntermediateJavaQuestions() {
        Questions questions = new Questions();
        Random random =new Random();
        int randomQuestionIndex = random.nextInt(questions.intermediateQuestions.length-1);
        System.out.println(questions.questions[randomQuestionIndex]);
    }

    void askExpertJavaQuestions() {
        Questions questions = new Questions();
        Random random =new Random();
        int randomQuestionIndex = random.nextInt(questions.expertQuestions.length-1);
        System.out.println(questions.questions[randomQuestionIndex]);

    }
}